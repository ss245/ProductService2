package com.ecommerce.ProductService.Service;

import com.ecommerce.ProductService.DTOs.ProductDto;
import com.ecommerce.ProductService.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    public ProductDto getProductDto(){
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://fakestoreapi.com/products/1";
        Product product = restTemplate.getForObject(apiUrl,Product.class);
        System.out.println(product);

        ProductDto obj = new ProductDto();
        obj.setName("Samsung S23 FE");
        obj.setPrice(45000.00);
        obj.setImageUrl("www.samsung.com");
        return obj;
    }

}
