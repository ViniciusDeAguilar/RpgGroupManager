package com.groupmanager.service;

import com.groupmanager.dto.MagicDto;
import com.groupmanager.dto.SheetDto;
import com.groupmanager.exception.MagicNotFoundExeption;
import com.groupmanager.model.Magic;
import com.groupmanager.repo.MagicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MagicService {
    private final MagicRepo magicRepo;

    // Constructor
    @Autowired
    public MagicService(MagicRepo magicRepo){
        this.magicRepo = magicRepo;
    }

    // Add Magic
    public MagicDto addMagic(MagicDto magicDto){
        Magic magic = new Magic();

        magic.setName(magicDto.getName());
        magic.setType(magicDto.getType());
        magic.setDamage(magicDto.getDamage());
        magic.setEffect(magicDto.getEffect());
        magic.setCost(magicDto.getCost());

        magicRepo.save(magic);

        return null;
    }

    // Update Magic
    public MagicDto updateMagic(Long id, MagicDto magicDto){
        Magic magic = magicRepo.getById(id);

        magic.setName(magicDto.getName());
        magic.setType(magicDto.getType());
        magic.setDamage(magicDto.getDamage());
        magic.setEffect(magicDto.getEffect());
        magic.setCost(magicDto.getCost());

        magicRepo.save(magic);

        return null;
    }

    // Delete Magic
    public void deleteMagic(Long id){ magicRepo.deleteById(id); }

    // Get
    public MagicDto getMagic(Long id) throws MagicNotFoundExeption {
        Optional<Magic> magic = magicRepo.findById(id);

        MagicDto dto = new MagicDto();

        if(magic.isPresent()){
            Magic m = magic.get();

            dto.setName(m.getName());
            dto.setType(m.getType());
            dto.setDamage(m.getDamage());
            dto.setEffect(m.getEffect());
            dto.setCost(m.getCost());

            dto.setSheet(new SheetDto(m.getSheet()));

            return dto;
        }

        throw new MagicNotFoundExeption(id);
    }
}
