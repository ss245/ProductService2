package com.ecommerce.ProductService.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.format.jakartajson.JakartaJsonIntegration;

import java.util.List;

@Getter
@Setter
@Entity
public class Instructor extends User{
    private Double salary;
    private String skill;
    @OneToMany(mappedBy = "instructor", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Batch> batch;
}
