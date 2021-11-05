package com.groupmanager.controller;

import com.groupmanager.dto.SheetDto;
import com.groupmanager.service.SheetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sheet")
public class SheetController {
    private final SheetService sheetService;

    public SheetController(SheetService sheetService){ this.sheetService= sheetService; }

    // Add Sheet
    @PostMapping("/add")
    public ResponseEntity<SheetDto> saveSheet(@RequestBody SheetDto sheetDto){
        sheetService.addSheet(sheetDto);

        return ResponseEntity.ok().body(sheetDto);
    }

    // Update Sheet
    @PutMapping("/update/{id}")
    public ResponseEntity<Long> updateSheet(@RequestBody SheetDto sheetDto, @PathVariable Long id){
        sheetService.updateSheet(id, sheetDto);

        return ResponseEntity.ok().body(id);
    }

    // Delete Sheet
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSheet(@PathVariable Long id){
        sheetService.deleteSheet(id);

        return null;
    }
}
