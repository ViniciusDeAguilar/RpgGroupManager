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
public class Magic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String name;

    private String type;

    private String damage;

    private String effect;

    private Integer cost;

    @ManyToOne
    @JoinColumn(name = "sheet_id", nullable = false)
    private Sheet sheet;
}
