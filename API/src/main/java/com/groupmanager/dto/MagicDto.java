package com.groupmanager.dto;

import lombok.Data;

@Data
public class MagicDto {
    private Long id;
    private String name;
    private String type;
    private String damage;
    private String effect;
    private int cost;
}
