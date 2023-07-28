package com.example.Recipe.management.system.API.controller;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // Implement comment-related endpoints (e.g., addComment, getCommentsForRecipe, etc.).
}