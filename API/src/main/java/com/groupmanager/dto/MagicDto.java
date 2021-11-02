package com.groupmanager.dto;

import com.groupmanager.model.Sheet;
import lombok.Data;

@Data
public class MagicDto {
    private Long id;
    private String name;
    private String type;
    private String damage;
    private String effect;
    private Integer cost;

    private SheetDto sheet;
}
