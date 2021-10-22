package com.groupmanager.service;

import com.groupmanager.dto.WeaponDto;
import com.groupmanager.exception.WeaponNotFoundException;
import com.groupmanager.model.Weapon;
import com.groupmanager.repo.WeaponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

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

    // Update weapon
    public WeaponDto updateWeapon(Long id ,WeaponDto weaponDto){
        Weapon weapon = weaponRepo.getById(id);

        weapon.setName(weaponDto.getName());
        weapon.setDamage(weaponDto.getDamage());
        weapon.setType(weaponDto.getType());
        weaponRepo.save(weapon);

        return null;
    }

    // Delete weapon
    public void deleteWeapon(Long id){
        weaponRepo.deleteById(id);
    }

    // Get weapon
    public WeaponDto getWeapon(Long id) throws WeaponNotFoundException {
        Optional<Weapon> weapon = weaponRepo.findById(id);

        WeaponDto dto = new WeaponDto();

        if(weapon.isPresent()){
            Weapon w = weapon.get();

            dto.setName(w.getName());
            dto.setType(w.getType());
            dto.setDamage(w.getDamage());

            dto.setSheet_id(w.getSheet());

            return dto;
        }

        throw new WeaponNotFoundException(id);
    }
    //Search all
    // Roll Attack
}
