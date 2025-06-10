package com.bank.lyon.controller;

import com.bank.lyon.model.User;
import com.bank.lyon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class MainController {
/* @Autowired
UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<Void> addUser(@RequestBody User user){

        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userRepository.findById(id);

    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") String id) {
        userRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }*/
}
