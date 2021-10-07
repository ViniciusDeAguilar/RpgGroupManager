package com.groupmanager.service;

import com.groupmanager.repo.PerkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerkService {
    private PerkRepo perkRepo;

    // Constructor
    @Autowired
    public PerkService(PerkRepo perkRepo){
        this.perkRepo = perkRepo;
    }
}
