package com.likesmeverywell.LearnSpringSecurity.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}
