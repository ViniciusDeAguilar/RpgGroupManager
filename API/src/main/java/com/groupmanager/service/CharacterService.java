package com.groupmanager.service;

import com.groupmanager.dto.CharacterDto;
import com.groupmanager.model.Character;
import com.groupmanager.repo.CharacterRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharacterService{

    private final CharacterRepo characterRepo;

    //Constructor
    @Autowired
    public CharacterService(CharacterRepo characterRepo){
        this.characterRepo = characterRepo;
    }

    // Add new Character
    public CharacterDto addCharacter(CharacterDto characterDto){
        Character character = new Character();

        character.setName(characterDto.getName());
        character.setRace(characterDto.getRace());
        character.setClass_(characterDto.getClass_());
        character.setLevel(characterDto.getLevel());
        character.setImageUrl(characterDto.getImageUrl());

        characterRepo.save(character);
        return null;
    }

    // Update Character
    public CharacterDto updateCharacter(Long id, CharacterDto characterDto){
        Character character = characterRepo.getById(id);

        character.setName(characterDto.getName());
        character.setRace(characterDto.getRace());
        character.setClass_(characterDto.getClass_());
        character.setLevel(characterDto.getLevel());
        character.setImageUrl(characterDto.getImageUrl());

        characterRepo.save(character);
        return null;
    }
}