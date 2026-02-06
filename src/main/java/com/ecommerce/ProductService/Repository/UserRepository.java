package com.ecommerce.ProductService.Repository;

import com.ecommerce.ProductService.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    Optional<User> findById(Long aLong);

    Optional<User> findByname(String name);

    List<User> findByNameEndingWith(String suffix);

    @Override
    User save(User entity);
}
