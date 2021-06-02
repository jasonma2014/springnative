package com.example.springnative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/greeting/{name}")
    public String getAllUsers(@PathVariable String name) {
        return "hello " + name;
    }
}
