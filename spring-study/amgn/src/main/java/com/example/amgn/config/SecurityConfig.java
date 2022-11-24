package com.example.amgn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.wed.builders.HttpSecurity;

@Configuration
@EnableWebSecurity // Spring security 활성화
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Bean
    public BCryptPasswordEncoder encodePwd() { // 비밀번호 암호화를 위한 객체 생성 후 Bean으로 등록
        return new BCryptPasswordEncoder(); // 로그인 시 암호화 되어 진행
    }

}