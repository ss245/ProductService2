package com.ecommerce.ProductService.Service;

import com.ecommerce.ProductService.DTOs.ProductDto;
import com.ecommerce.ProductService.Exceptions.NotFoundException;
import com.ecommerce.ProductService.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class ProductService {

    public ProductDto getProductDto() throws NotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://fakestoreapi.com/products/21";
        Product product = restTemplate.getForObject(apiUrl,Product.class);
        if(product==null) throw new NotFoundException();
        System.out.println(product);

        ProductDto obj = new ProductDto();
        obj.setName("Samsung S23 FE");
        obj.setPrice(45000.00);
        obj.setImageUrl("www.samsung.com");
        return obj;
    }

    public  Product[] getProducts() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://fakestoreapi.com/products";
        Product[] products = restTemplate.getForObject(apiUrl, Product[].class);
        return products;
    }
}
