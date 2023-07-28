package com.example.Recipe.management.system.API.service;

// UserService.java
@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Implement user-related methods (e.g., registerUser, findUserByUsername, etc.).
}