package com.testproject.jpa.bookmanager.repository;

import com.testproject.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private final UserRepository userRepository; // 의존성 추가

    UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void crud() { // create, read, update, delete - 기본적인 쿼리 동작
        userRepository.save(new User()); // user 생성 후 테이블에 저장

        System.out.println(">>> " + userRepository.findAll()); // User 테이블의 모든 데이터를 리스트 형식으로 가지고 옴
    }
}