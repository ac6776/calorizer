package com.buntolabs.calorizer.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Element extends BasicNutrition {
    @Enumerated(value = EnumType.STRING)
    private Type type;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ELEMENT_ELEMENTDETAILS",
            joinColumns = { @JoinColumn(name = "element_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "detail_id", referencedColumnName = "id") }
    )
    private List<ElementDetails> details;
//    @OneToMany(mappedBy = "element")
//    private List<Img> images;
}
