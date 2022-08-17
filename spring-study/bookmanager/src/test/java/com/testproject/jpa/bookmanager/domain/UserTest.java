package com.testproject.jpa.bookmanager.domain;

import org.hibernate.boot.jaxb.internal.stax.LocalSchemaLocator;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
//이거 Test에서는 위에있는 user불러오는 거잔항용 맞죠네네

class UserTest { // toString method 를 오버라이딩 함
    @Test
    void test() {
        User user = new User();
        user.setEmail("inda@gmail.com");
        user.setName("inda");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        User user1 = new User(null, "martin", "martin@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        // User user3 = User.builder().name("martin").email("martin@gmail.com").build();

        System.out.println(">>> " + user.toString());
    }
}