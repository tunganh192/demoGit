package com.honda.demoWeek2.controller;

import com.honda.demoWeek2.model.User;
import com.honda.demoWeek2.service.UserService;
import com.honda.demoWeek2.service.UserService2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserService2 userService2;

    public UserController(UserService userService, UserService2 userService2) {
        this.userService = userService;
        this.userService2 = userService2;
    }


    // GET
    @GetMapping
    public int getAll() {
        return userService2.cong();
    }


    // POST
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
}