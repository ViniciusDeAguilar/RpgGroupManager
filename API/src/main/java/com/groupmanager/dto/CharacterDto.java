package com.groupmanager.dto;

import lombok.Data;

@Data
public class CharacterDto {

    private Long id;
    private String name;
    private String race;
    private String class_;
    private String level;
    private String imageUrl;

}
