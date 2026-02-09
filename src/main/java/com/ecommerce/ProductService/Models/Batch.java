package com.ecommerce.ProductService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Batch {
    @Id
    private Long id;
    private String name;
    private int strength;
}
