package com.groupmanager.dto;

import com.groupmanager.model.Magic;
import com.groupmanager.model.Sheet;
import lombok.Data;
import com.groupmanager.dto.SheetDto;

@Data
public class MagicDto {
    private Long id;
    private String name;
    private String type;
    private String damage;
    private String effect;
    private Integer cost;

    private SheetDto sheet;

    // Constructor
//    public MagicDto(Magic magic) {
//        this.name = magic.getName();
//        this.type = magic.getType();
//        this.damage = magic.getDamage();
//        this.effect = magic.getEffect();
//        this.cost = magic.getCost();
//    }
}
