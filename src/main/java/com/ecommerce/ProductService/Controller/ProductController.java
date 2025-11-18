package com.ecommerce.ProductService.Controller;

import com.ecommerce.ProductService.Models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id){
        return " Product with id: "+ id;
    }
    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        return "Product created. "+ product.getName() + product.getPrice();
    }


}
