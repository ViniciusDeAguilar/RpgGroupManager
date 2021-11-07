package com.groupmanager.controller;

import com.groupmanager.dto.CharacterDto;
import com.groupmanager.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Character")
public class CharacterController{
    private final CharacterService characterService;

    // Constructor
    @Autowired
    public CharacterController(CharacterService characterService){ this.characterService = characterService; }

    // Add Character
    @PostMapping("/add")
    public ResponseEntity<CharacterDto> addCharacter(@RequestBody CharacterDto characterDto){
        characterService.addCharacter(characterDto);

        return ResponseEntity.ok().body(characterDto);
    }

    // Update Character
    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updateCharacter(@PathVariable Long id, @RequestBody CharacterDto dto){
        characterService.updateCharacter(id, dto);

        return ResponseEntity.ok().body(id);
    }

    // Delete character
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable Long id){
        characterService.deleteCharacter(id);

        return null;
    }
}
