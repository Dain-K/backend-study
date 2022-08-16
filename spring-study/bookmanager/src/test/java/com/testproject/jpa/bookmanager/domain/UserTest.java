package com.testproject.jpa.bookmanager.domain;

import org.hibernate.boot.jaxb.internal.stax.LocalSchemaLocator;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class UserTest { // toString method 를 오버라이딩 함
    @Test
    void test() {
        User user = new User();
        user.setEmail("inda@gmail.com");
        user.setName("inda");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User("martin", "martin@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("martin", "martin@gmail.com");
        User user3 = User.builder().name("martin").email("martin@gmail.com").build();

        System.out.println(">>> " + user.toString());
    }
}