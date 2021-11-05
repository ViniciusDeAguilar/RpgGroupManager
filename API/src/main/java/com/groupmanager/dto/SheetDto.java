package com.groupmanager.dto;

import com.groupmanager.model.Sheet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SheetDto {
    private Long id;
    private Integer hp;
    private Integer mp;
    private Integer str;
    private Integer dex;
    private Integer cons;
    private Integer inte;
    private Integer wis;
    private Integer chari;

     //Constructor
    public SheetDto(Sheet sheet) {
        this.hp = sheet.getHp();
        this.mp = sheet.getMp();
        this.str = sheet.getStr();
        this.dex = sheet.getDex();
        this.cons = sheet.getCons();
        this.inte = sheet.getInte();
        this.wis = sheet.getWis();
        this.chari = sheet.getChari();
    }
}
