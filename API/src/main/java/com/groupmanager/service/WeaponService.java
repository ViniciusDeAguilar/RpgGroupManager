package com.groupmanager.service;

import com.groupmanager.dto.WeaponDto;
import com.groupmanager.model.Weapon;
import com.groupmanager.repo.WeaponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponService {
    private WeaponRepo weaponRepo;

    // Constructor
    @Autowired
    public WeaponService(WeaponRepo weaponRepo){
        this.weaponRepo = weaponRepo;
    }

    // Add new weapon
    public WeaponDto addWeapon(WeaponDto weaponDto){
        Weapon weapon = new Weapon();

        weapon.setName(weaponDto.getName());
        weapon.setDamage(weaponDto.getDamage());
        weapon.setType(weaponDto.getType());
        weaponRepo.save(weapon);

        return null;
    }

    // Update
    // Delete weapon
    // Roll Atack
}
