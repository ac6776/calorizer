package com.buntolabs.calorizer.entities;

import javax.persistence.*;

@Entity
@Table(name = "nutritious")
class Nutrition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Type type;
//    private double kCal;
//    private String description;
}
