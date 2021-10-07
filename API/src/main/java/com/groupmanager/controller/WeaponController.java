package com.groupmanager.controller;

import com.groupmanager.dto.WeaponDto;
import com.groupmanager.service.WeaponService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Weapon")
public class WeaponController {
    private WeaponService weaponService;

    public WeaponController(WeaponService weaponService){
        this.weaponService = weaponService;
    }

    @PostMapping("/add")
    public ResponseEntity<WeaponDto> saveWeapon(@RequestBody WeaponDto dto){
        WeaponDto d = weaponService.addWeapon(dto);
        return ResponseEntity.ok().body(dto);
    }
}
