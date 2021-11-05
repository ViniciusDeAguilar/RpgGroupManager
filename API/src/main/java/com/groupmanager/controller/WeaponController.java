package com.groupmanager.controller;

import com.groupmanager.dto.WeaponDto;
import com.groupmanager.exception.WeaponNotFoundException;
import com.groupmanager.service.WeaponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Weapon")
public class WeaponController {
    private final WeaponService weaponService;

    Logger l = LoggerFactory.getLogger(WeaponController.class);

    public WeaponController(WeaponService weaponService){
        this.weaponService = weaponService;
    }

    //Get
    @GetMapping("/{id}")
    public ResponseEntity<WeaponDto> getWeapon(@PathVariable Long id){
        try{
            WeaponDto weapon = weaponService.getWeapon(id);

            return ResponseEntity.ok().body(weapon);
        }

        catch(WeaponNotFoundException e){
            l.error(e.getLocalizedMessage());

            return ResponseEntity.notFound().build();
        }
    }

    // Get all


    @PostMapping("/add")
    public ResponseEntity<WeaponDto> saveWeapon(@RequestBody WeaponDto dto){
        weaponService.addWeapon(dto);
        return ResponseEntity.ok().body(dto);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updateWeapon(@RequestBody WeaponDto dto, @PathVariable Long id){
        weaponService.updateWeapon(id , dto);

        return ResponseEntity.ok().body(id);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteWeapon(@PathVariable Long id){
        weaponService.deleteWeapon(id);

        return null;
    }
}
