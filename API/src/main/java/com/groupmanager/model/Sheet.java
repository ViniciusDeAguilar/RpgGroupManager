package com.groupmanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

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

    @OneToOne(mappedBy = "sheet")
    private Character character;

    @OneToMany(mappedBy = "sheet")
    private Set<Perk> perk;

    @OneToMany(mappedBy = "sheet")
    private Set<Weapon> weapon;

    @OneToMany(mappedBy = "sheet")
    private Set<Magic> magic;
}
