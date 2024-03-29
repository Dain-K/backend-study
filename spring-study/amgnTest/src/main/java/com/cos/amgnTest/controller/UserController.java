package com.cos.amgnTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.amgnTest.model.User;
import com.cos.amgnTest.repository.UserRepository;

@Controller // view를 리턴하겠다!!
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	// localhost:8080/
	// localhost:8080
	@GetMapping({"","/"})
	public String index() {
		// 머스테치 기본폴더 src/main/resources/
		// view 폴더 설정: templates (prefix), mustache (suffix) 생략 가능
		return "index";
	}
	
	@GetMapping("/user")
	public @ResponseBody  String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public @ResponseBody  String admin() {
		return "admin";
	}

	@GetMapping("/manager")
	public @ResponseBody  String manager() {
		return "manager";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "joinForm";
	}
	
	@PostMapping("/join") // joinForm에서 POST 형식이므로
	public String join(User user) { // 값을 받아옴
		System.out.println(user);
		user.setRole("ROLE_USER");
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userRepository.save(user);
		return "redirect:/loginForm"; // redirect: loginForm 함수로 가줌
	}
	
}
