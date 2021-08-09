package com.buntolabs.calorizer.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Data
public class Product extends BasicNutrition {
//    @ElementCollection
//    @CollectionTable(name = "nutrition_weight_mapping",
//        joinColumns = {@JoinColumn(name = "id", referencedColumnName = "id")})
//    @MapKeyColumn(name = "name")
//    private Map<Element, Integer> nutritiousWeightMap;
}
