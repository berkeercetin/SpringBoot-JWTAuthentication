package com.authAngular.tutorial.authAngular.api.controllers;

import com.authAngular.tutorial.authAngular.businness.abstracts.UserService;
import com.authAngular.tutorial.authAngular.dto.CredentialsDto;
import com.authAngular.tutorial.authAngular.dto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final UserService userService;

    AuthController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody CredentialsDto credentialsDto){
        UserDto user = userService.login(credentialsDto);
        return ResponseEntity.ok(user);
    }
}
