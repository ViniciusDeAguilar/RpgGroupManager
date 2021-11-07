package com.groupmanager.service;

import com.groupmanager.dto.PerkDto;
import com.groupmanager.model.Perk;
import com.groupmanager.repo.PerkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerkService {
    private final PerkRepo perkRepo;

    // Constructor
    @Autowired
    public PerkService(PerkRepo perkRepo){
        this.perkRepo = perkRepo;
    }

    // Add Perk
    public PerkDto addPerk(PerkDto perkDto){
        Perk perk = new Perk();

        perk.setName(perkDto.getName());
        perk.setEffect(perkDto.getEffect());

        perkRepo.save(perk);
        return null;
    }

    // Update Perk
    public PerkDto upadatePerk(Long id,PerkDto dto){
        Perk perk = perkRepo.getById(id);

        perk.setName(dto.getName());
        perk.setEffect(dto.getEffect());

        perkRepo.save(perk);
        return null;
    }

    // Delete Perk
    public void deletePerk(Long id){
        perkRepo.deleteById(id);
    }
}
