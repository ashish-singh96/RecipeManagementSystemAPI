package com.example.Recipe.management.system.API.controller;

// UserController.java
@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Implement user-related endpoints (e.g., registration, login, etc.).
}