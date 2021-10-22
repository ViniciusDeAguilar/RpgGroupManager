package com.groupmanager.dto;

import com.groupmanager.model.Sheet;
import lombok.Data;

@Data
public class WeaponDto {
    private Long id;
    private String name;
    private String type;
    private String damage;

    private Sheet sheet_id;

}
