package com.ecommerce.ProductService.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;
    private double price;
    private String imageUrl;
}
