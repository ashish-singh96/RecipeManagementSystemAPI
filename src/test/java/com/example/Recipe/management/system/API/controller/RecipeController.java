package com.example.Recipe.management.system.API.controller;

// RecipeController.java
@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    // Implement recipe-related endpoints (e.g., create, read, update, delete, etc.).
}

// RecipeController.java
@RestController
@RequestMapping("/api/recipes")
public class RecipeController {
    // ...

    @PutMapping("/{id}")
    public ResponseEntity<Recipe> updateRecipe(
            @PathVariable Long id,
            @RequestBody Recipe updatedRecipe,
            @AuthenticationPrincipal UserDetails userDetails
    ) {
        Recipe existingRecipe = recipeService.findById(id);

        if (existingRecipe == null) {
            return ResponseEntity.notFound().build();
        }

        // Check if the current user is the owner of the recipe
        if (!existingRecipe.getOwner().getUsername().equals(userDetails.getUsername())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }

        existingRecipe.setName(updatedRecipe.getName());
        existingRecipe.setIngredients(updatedRecipe.getIngredients());
        existingRecipe.setInstructions(updatedRecipe.getInstructions());

        Recipe savedRecipe = recipeService.save(existingRecipe);
        return ResponseEntity.ok(savedRecipe);
    }
}
