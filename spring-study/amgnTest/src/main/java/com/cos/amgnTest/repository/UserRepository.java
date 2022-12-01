package com.cos.amgnTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.amgnTest.model.User;

// CRUD 함수를 JpaRepository가 들고 있음
// @Repository라는 어노테이션이 없어도 IoC가 된다. 이유는 JpaRepository를 상속했기 때문에
public interface UserRepository extends JpaRepository<User, Integer> {
	
	// findBy: 규칙 => Username: 문법
	// select * from user where username = ?parameter
	public User findByUsername(String username); // jpa 쿼리 메소드
	
	// select * from user where email = ?parameter
	// public User findByEmail;
}
