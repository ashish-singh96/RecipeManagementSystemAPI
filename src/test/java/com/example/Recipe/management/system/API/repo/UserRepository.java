package com.example.Recipe.management.system.API.repo;

import com.example.Recipe.management.system.API.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}