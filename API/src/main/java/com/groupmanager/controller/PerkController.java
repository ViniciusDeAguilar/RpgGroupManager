package com.groupmanager.controller;

import com.groupmanager.dto.PerkDto;
import com.groupmanager.service.PerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Perk")
public class PerkController {
    private final PerkService perkService;

    // Comstructor
    @Autowired
    public PerkController(PerkService perkService){ this.perkService = perkService; }

    // Add Perk
    @PostMapping("/add")
    public ResponseEntity<PerkDto> addPerk(@RequestBody PerkDto dto){
        perkService.addPerk(dto);

        return ResponseEntity.ok().body(dto);
    }

    // Update Perk
    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updatePerk(@PathVariable Long id, @RequestBody PerkDto dto){
        perkService.upadatePerk(id, dto);

        return ResponseEntity.ok().body(id);
    }

    // Delete Perk
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePerk(@PathVariable Long id){
        perkService.deletePerk(id);

        return null;
    }
}
