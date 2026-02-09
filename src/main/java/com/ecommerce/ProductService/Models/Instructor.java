package com.ecommerce.ProductService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Instructor extends User{
    private Double salary;
    private String skill;
    @OneToMany
    private List<Batch> batch;
}
