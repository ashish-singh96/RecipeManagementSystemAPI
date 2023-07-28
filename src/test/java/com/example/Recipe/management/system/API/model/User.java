package com.example.Recipe.management.system.API.model;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    // Add other user-related fields and annotations (e.g., password, roles, etc.).
    // Getters and setters
}