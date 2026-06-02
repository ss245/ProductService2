package com.ecommerce.ProductService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Batch {
    @Id
    private Long id;
    private String name;
    private int strength;
    @ManyToOne
    private Instructor instructor;
}
