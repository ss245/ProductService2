package com.ecommerce.ProductService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.id.IdentityGenerator;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.security.PublicKey;

@Entity
@Data
@NoArgsConstructor
public class GenericProduct {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;

    public GenericProduct(String name, int price){
        this.name=name;
        this.price=price;
    }

}
