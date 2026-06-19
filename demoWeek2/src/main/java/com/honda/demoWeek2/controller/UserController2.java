package com.honda.demoWeek2.controller;

import com.honda.demoWeek2.model.User;
import com.honda.demoWeek2.service.UserService;
import com.honda.demoWeek2.service.UserService2;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users2")
public class UserController2 {

    private final UserService userService;
    private final UserService2 userService2;
    private final ApplicationContext applicationContext;

    public UserController2(UserService userService, UserService2 userService2, ApplicationContext applicationContext) {
        this.userService = userService;
        this.userService2 = userService2;
        this.applicationContext = applicationContext;
    }


    // GET
//    @GetMapping("/{id}")
//    public int getAll(@PathVariable String id) {
//        return 100000000;
//    }



    @GetMapping("/getAll")
    public String getAll2(@RequestParam String name) {
        UserService2 userService2 = applicationContext.getBean(UserService2.class);
        return name;
    }


    // POST
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
}