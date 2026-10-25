package com.example.backend.service;

import com.example.backend.dto.UserDto;
import com.example.backend.entities.User;
import com.example.backend.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public ResponseEntity<?> saveUser(UserDto userDto){
        User user = new User(userDto.getUsername(),userDto.getPhoneNo());
        user = this.userRepository.save(user);
        return ResponseEntity.ok(user);
    }
}
