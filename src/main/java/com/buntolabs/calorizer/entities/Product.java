package com.buntolabs.calorizer.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String product_title;
    private String product_description;
    private double kCal;
    @ElementCollection
    @CollectionTable(name = "nutrition_weight_mapping",
        joinColumns = {@JoinColumn(name = "id", referencedColumnName = "product_id")})
    @MapKeyColumn(name = "nutrition_name")
    private Map<Nutrition, Integer> nutritiousWeightMap;
}
