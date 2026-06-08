package com.ecommerce.ProductService.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InstructorDto {
    private String name;
    private String email;
    private String skill;
    private List<String> batchName;
    private List<Long> batchId;
}
