package com.cos.amgnTest.config.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cos.amgnTest.model.User;

// 시큐리티가 /login 주소 요청이 오면 낚아채서 로그인 진행
// 로그인 진행이 완료가 되면 시큐리티가 가지고 있는 session에 만들어준다. (security session: 원래 공간과 key 값으로 구분한다는 것, Security ContextHolder에 저장)
// 여기 들어갈 수 있는 오브젝트가 정해져 있음 => Authentication 타입 객체
// Authentication 안에 User 정보가 있어야 함.
// User 오브젝트 타입 => UserDetails 타입 객체

// Security Session => Authentication => UserDetails(PrincipleDetails)

public class PrincipleDetails implements UserDetails {

	private User user; // 컴포지션
	
	public PrincipleDetails(User user) { // 생성자
		this.user = user;
	}
	
	// 해당 User의 권한을 return 하는 곳!!
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// user.getRole(); String 타입이기 때문에 사용할 수 없음 
		Collection<GrantedAuthority> collect = new ArrayList<>();
		collect.add(new GrantedAuthority() {
			@Override
			public String getAuthority() {
				return user.getRole();
			}
		});
		return collect;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		// 1년동안 회원이 로그인을 안하면 휴먼계정으로!!
		// 현재시간 - 로그인 시간 => 1년을 초과하면 return false
		return true;
	}

}
