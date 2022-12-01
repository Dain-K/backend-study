package com.cos.amgnTest.config.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cos.amgnTest.model.User;
import com.cos.amgnTest.repository.UserRepository;

// 시큐리티 설정에서 loginProcessingUrl("/login");
// /login 주소 요청이 오면 자동으로 UserDetailsService 타입으로 IoC되어 있는 loaduserByUsername 함수가 실행
@Service
public class PrincipleDetailsService implements UserDetailsService {

	
	@Autowired
	private UserRepository userRepository;
	
	// 시큐리티 세션 = Authentication = UserDetails
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { // input 값에서 name =  "username"을 받아옴

		User userEntity = userRepository.findByUsername(username);	
		if(userEntity != null) { // 유저가 있는 경우
			return new PrincipleDetails(userEntity); // Authentication 내부에 들어가게 된다. -> 시큐리티 session에 들어가게 된다.
		}
		return null;
	}

}
