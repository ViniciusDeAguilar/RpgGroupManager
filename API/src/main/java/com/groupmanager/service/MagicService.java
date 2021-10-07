package com.groupmanager.service;

import com.groupmanager.repo.MagicRepo;
import org.springframework.stereotype.Service;

@Service
public class MagicService {
    private MagicRepo magicRepo;

    // Constructor
    public MagicService(MagicRepo magicRepo){
        this.magicRepo = magicRepo;
    }
}
