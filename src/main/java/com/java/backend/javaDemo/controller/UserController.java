package com.java.backend.javaDemo.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import com.java.backend.javaDemo.model.User;
import com.java.backend.javaDemo.service.UserService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

//import org.springframework.data.rest.webmvc;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List <User> getAllUsers() {
        return userService.findAllUsers();
    }

//    @GetMapping("/users/{id}")
//    public ResponseEntity < User > getEmployeeById(@PathVariable(value = "id") Long employeeId)
//    { //throws ResourceNotFoundException {
//        User user = userRepository.findById(employeeId).orElse(null);
//                //.orElseThrow(() -> new ResourceNotFoundException("User does not exist with id: " + employeeId));
//        return ResponseEntity.ok().body(user);
//    }

    @PostMapping("/users")
    public User createEmployee(@Valid @RequestBody User user) {
        return userService.save(user);
    }

//    @PutMapping("/users/{id}")
//    public ResponseEntity < User > updateEmployee(@PathVariable(value = "id") Long userId,
//                                                      @Valid @RequestBody User employeeDetails) {//throws ResourceNotFoundException {
//        User user = userService.findById(userId).orElse(null);
//                //.orElseThrow(() -> new ResourceNotFoundException("User does not exist with id: " + userId));
//
//        user.setEmail(employeeDetails.getEmail());
//        user.setLastName(employeeDetails.getLastName());
//        user.setFirstName(employeeDetails.getFirstName());
//        final User updatedUser = userRepository.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }

//    @DeleteMapping("/users/{id}")
//    public Map < String, Boolean > deleteEmployee(@PathVariable(value = "id") Long employeeId)
//    {//throws ResourceNotFoundException {
//        User user = userRepository.findById(employeeId).orElse(null);
//                //.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + employeeId));
//
//        userRepository.delete(user);
//        Map < String, Boolean > response = new HashMap < > ();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
}