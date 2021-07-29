package com.buntolabs.calorizer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "things")
@Data
public class Thing {
    @Id
    private Long id;
    private String name;
    private String data;
}
