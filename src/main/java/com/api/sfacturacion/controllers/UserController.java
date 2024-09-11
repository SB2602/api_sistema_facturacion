package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.User;
import com.api.sfacturacion.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final UserService userService;

    @GetMapping("/user")
    private List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/user")
    private void editById(@RequestBody User user) {
        userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
