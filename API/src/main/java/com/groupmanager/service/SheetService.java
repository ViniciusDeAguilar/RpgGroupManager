package com.groupmanager.service;

import com.groupmanager.repo.SheetRepo;
import org.springframework.stereotype.Service;

@Service
public class SheetService {
    private SheetRepo sheetRepo;

    // Constructor
    public SheetService(SheetRepo sheetRepo){
        this.sheetRepo = sheetRepo;
    }
}
