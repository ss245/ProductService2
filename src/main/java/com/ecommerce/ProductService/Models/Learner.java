package com.ecommerce.ProductService.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Learner extends User {

    private String University;
    private Double psp;


}