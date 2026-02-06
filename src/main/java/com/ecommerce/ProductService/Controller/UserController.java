package com.ecommerce.ProductService.Controller;

import com.ecommerce.ProductService.DTOs.UserDto;
import com.ecommerce.ProductService.Models.User;
import com.ecommerce.ProductService.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    // Add method for creating a user
    // We created UserDto class to take parameters from user
    // Now we want to create user and persist that user in database

    //injecting dependency injection

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User createUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable(name="name") String name){
        return userService.getUserByName(name);
    }

    // Now we are implementing findByNameEndingWith method

    @GetMapping("/{end}/{suffix}")
    public List<User> getByNameEndingWith(@PathVariable("end") String end,@PathVariable("suffix") String suffix){
        return userService.getByNameEndingwith(suffix);
    }



}
