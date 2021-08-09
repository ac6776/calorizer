package com.buntolabs.calorizer.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "images")
public class Img {
    @Id
    private Long id;
    private String src;
    private String alt;
//    @ManyToOne
//    private BasicNutrition element;
}
