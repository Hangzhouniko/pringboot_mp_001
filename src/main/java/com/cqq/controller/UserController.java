package com.cqq.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public Result getById(@PathVariable "{id}"){
        return null;
    }
}
