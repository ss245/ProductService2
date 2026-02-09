package com.ecommerce.ProductService.Service;

import com.ecommerce.ProductService.DTOs.UserDto;
import com.ecommerce.ProductService.Models.Instructor;
import com.ecommerce.ProductService.Models.User;
import com.ecommerce.ProductService.Repository.InstructorRepository;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {


    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }


    public Instructor createInstructor(UserDto userDto) {
        Instructor instructor = new Instructor();
        instructor.setName(userDto.getName());
        instructor.setEmail(userDto.getEmail());
        instructor.setSalary(100000.0);
        instructor.setSkill("Backend");
        instructorRepository.save(instructor);
        return instructor;
    }
}
