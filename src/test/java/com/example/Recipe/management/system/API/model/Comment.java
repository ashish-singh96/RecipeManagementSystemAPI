package com.example.Recipe.management.system.API.model;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String content;
    @ManyToOne
    private Recipe recipe;
    @ManyToOne
    private User user;
    // Getters and setters
}
