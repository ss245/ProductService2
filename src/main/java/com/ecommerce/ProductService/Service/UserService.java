package com.ecommerce.ProductService.Service;

import com.ecommerce.ProductService.DTOs.InstructorDto;
import com.ecommerce.ProductService.DTOs.UserDto;
import com.ecommerce.ProductService.Models.Batch;
import com.ecommerce.ProductService.Models.Instructor;
import com.ecommerce.ProductService.Models.User;
import com.ecommerce.ProductService.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<InstructorDto> getInstructorDtoByName(String name) {
        List<Instructor> instructors = userRepository.findByName(name);
        List<InstructorDto> instructorDtos = new ArrayList<>();
        for(Instructor instructor :instructors){
            InstructorDto instructorDto = new InstructorDto();
            instructorDto.setName(instructor.getName());
            instructorDto.setEmail(instructor.getEmail());
            List<Batch> batches = instructor.getBatch();
            List<String> batchNames = new ArrayList<>();
            for(Batch batch: batches){
                batchNames.add(batch.getName());
            }
            instructorDto.setBatchName(batchNames);
            List<Long> batchIds = new ArrayList<>();
            for(Batch batch : batches){
                batchIds.add(batch.getId());
            }
            instructorDto.setBatchId(batchIds);
            instructorDtos.add(instructorDto);
        }
        return instructorDtos;
    }

    public List<User> getUserByName(String name) {
        return userRepository.findByname(name);
    }

//    public List<User> getByNameEndingwith(String suffix) {
//        return userRepository.findByNameEndingWith(suffix);
//    }
}
