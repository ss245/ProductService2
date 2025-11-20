package com.ecommerce.ProductService.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private String category;
}
