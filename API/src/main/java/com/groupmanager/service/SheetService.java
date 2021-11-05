package com.groupmanager.service;

import com.groupmanager.dto.SheetDto;
import com.groupmanager.model.Sheet;
import com.groupmanager.repo.SheetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SheetService {
    private final SheetRepo sheetRepo;

    // Constructor
    @Autowired
    public SheetService(SheetRepo sheetRepo){
        this.sheetRepo = sheetRepo;
    }

    // Add Sheet
   public SheetDto addSheet(SheetDto sheetDto){
        Sheet sheet = new Sheet();

        sheet.setHp(sheetDto.getHp());
        sheet.setMp(sheetDto.getMp());

        sheet.setStr(sheetDto.getStr());
        sheet.setDex(sheetDto.getDex());
        sheet.setCons(sheetDto.getCons());
        sheet.setInte(sheetDto.getInte());
        sheet.setWis(sheetDto.getWis());
        sheet.setChari(sheetDto.getChari());

        sheetRepo.save(sheet);
        return null;
   }

   // Update Sheet
    public SheetDto updateSheet(Long id, SheetDto sheetDto){
        Sheet sheet = sheetRepo.getById(id);

        sheet.setHp(sheetDto.getHp());
        sheet.setMp(sheetDto.getMp());

        sheet.setStr(sheetDto.getStr());
        sheet.setDex(sheetDto.getDex());
        sheet.setCons(sheetDto.getCons());
        sheet.setInte(sheetDto.getInte());
        sheet.setWis(sheetDto.getWis());
        sheet.setChari(sheetDto.getChari());

        sheetRepo.save(sheet);
        return null;
    }

    // Delete Sheet
    public void deleteSheet(Long id){ sheetRepo.deleteById(id);}
}
