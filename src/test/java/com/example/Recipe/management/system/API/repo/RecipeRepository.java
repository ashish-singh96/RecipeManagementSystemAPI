package com.example.Recipe.management.system.API.repo;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByOwner(User owner);
}