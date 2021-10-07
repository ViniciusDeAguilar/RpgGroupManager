package com.groupmanager.service;

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

}