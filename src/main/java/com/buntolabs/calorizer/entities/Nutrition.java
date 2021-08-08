package com.buntolabs.calorizer.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "nutritious")
@Data
public class Nutrition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long nutrition_id;
    @Column(nullable = false)
    private String nutrition_name;
    @Column(nullable = false)
    private Type nutrition_type;
    private String nutrition_description;
}
