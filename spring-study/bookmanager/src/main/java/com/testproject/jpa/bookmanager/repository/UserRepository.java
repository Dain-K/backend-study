package com.testproject.jpa.bookmanager.repository;

import com.testproject.jpa.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
