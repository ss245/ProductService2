package com.ecommerce.ProductService.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends User{
    private Double salary;
    private String skill;
}
