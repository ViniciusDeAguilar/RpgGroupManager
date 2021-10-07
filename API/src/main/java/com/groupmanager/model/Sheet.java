package com.groupmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class Sheet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private Integer hp;

    private Integer mp;

    private Integer str;

    private Integer dex;

    private Integer cons;

    private Integer int_;

    private Integer wis;

    private Integer char_;

    @OneToOne(mappedBy = "character")
    private Character character;
}
