package com.example.Recipe.management.system.API.service;

// RecipeService.java
@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    // Implement recipe-related methods (e.g., createRecipe, updateRecipe, deleteRecipe, etc.).
}