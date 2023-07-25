package org.example.fifthExcersise.controller;

import org.example.fifthExcersise.model.User;
import org.example.fifthExcersise.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/all")
    public ResponseEntity<List<User>> allUsers() {
        List<User> users = userService.getAllUsers();

        if (users == null) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/users/register")
    public ResponseEntity<HttpStatus> saveUser(@RequestBody User user){
        userService.saveUser(user);
        System.out.println(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
