package com.example.Recipe.management.system.API.service;

// CommentService.java
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // Implement comment-related methods (e.g., addCommentToRecipe, getCommentsForRecipe, etc.).
}