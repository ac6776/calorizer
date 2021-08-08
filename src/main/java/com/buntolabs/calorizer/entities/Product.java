package com.buntolabs.calorizer.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
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
    @CreationTimestamp
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime creation;
    @UpdateTimestamp
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updated;
}
