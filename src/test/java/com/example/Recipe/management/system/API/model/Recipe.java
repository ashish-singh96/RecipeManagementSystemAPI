package com.example.Recipe.management.system.API.model;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    @ElementCollection
    @NotEmpty
    private List<String> ingredients;
    @NotEmpty
    private String instructions;
    @ManyToOne
    private User owner;
    // Getters and setters
}

