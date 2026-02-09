package com.ecommerce.ProductService.Repository;

import com.ecommerce.ProductService.Models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Long> {
    @Override
    Instructor save(Instructor entity);
}
