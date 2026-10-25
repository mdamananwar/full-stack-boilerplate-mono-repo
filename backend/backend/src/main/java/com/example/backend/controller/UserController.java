package com.example.backend.controller;

import com.example.backend.dto.UserDto;
import com.example.backend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping(value = "")
    ResponseEntity<?> saveUser(@RequestBody UserDto userDto){
        return this.userService.saveUser(userDto);
    }

    @GetMapping("hello")
    public String helloWorld(){
        return "hello world";
    }
}
