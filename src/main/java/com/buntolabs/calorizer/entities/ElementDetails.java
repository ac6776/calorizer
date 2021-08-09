package com.buntolabs.calorizer.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
public class ElementDetails extends BasicDetail {
    @ManyToMany(mappedBy = "details")
    private List<Element> elements;
}
