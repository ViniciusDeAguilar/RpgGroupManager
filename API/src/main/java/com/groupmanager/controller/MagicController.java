package com.groupmanager.controller;

import com.groupmanager.dto.MagicDto;
import com.groupmanager.exception.MagicNotFoundExeption;
import com.groupmanager.service.MagicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/Magic")
public class MagicController {
    private final MagicService magicService;

    Logger l = LoggerFactory.getLogger(MagicController.class);

    public MagicController(MagicService magicService){ this.magicService = magicService; }

    // Get
    @GetMapping("/{id}")
    public ResponseEntity<MagicDto> getMagic(@PathVariable Long id){
        try{
            MagicDto magic = magicService.getMagic(id);

            return ResponseEntity.ok().body(magic);
        }
        catch(MagicNotFoundExeption e){
            l.error(e.getLocalizedMessage());

            return ResponseEntity.notFound().build();
        }
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<MagicDto> saveMagic(@RequestBody MagicDto magicDto){
        magicService.addMagic(magicDto);
        return ResponseEntity.ok().body(magicDto);
    }

    // update
    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updateMagic(@RequestBody MagicDto magicDto, @PathVariable Long id){
        magicService.updateMagic(id, magicDto);

        return ResponseEntity.ok().body(id);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteMagic(@PathVariable Long id){
        magicService.deleteMagic(id);

        return null;
    }
}



