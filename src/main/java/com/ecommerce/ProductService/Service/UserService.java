package com.ecommerce.ProductService.Service;

import com.ecommerce.ProductService.DTOs.UserDto;
import com.ecommerce.ProductService.Models.User;
import com.ecommerce.ProductService.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User createUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        userRepository.save(user);
        return user;
    }

    public User getUserByName(String name) {
        return userRepository.findByname(name).get();
    }

    public List<User> getByNameEndingwith(String suffix) {
        return userRepository.findByNameEndingWith(suffix);
    }
}
