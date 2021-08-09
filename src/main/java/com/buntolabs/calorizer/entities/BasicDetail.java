package com.buntolabs.calorizer.entities;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class BasicDetail {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String valString;
    private Integer valInteger;
    private Double valDouble;
    private Boolean valBoolean;
}
