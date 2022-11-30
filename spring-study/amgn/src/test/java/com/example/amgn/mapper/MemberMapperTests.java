package com.example.amgn.mapper;

import com.example.amgn.model.MemberVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {

    @Autowired
    private MemberMapper membermapper; // MemberMapper.java 인터페이스 의존성 주입

    // 회원가입 쿼리 테스트 메서드
    @Test
    public void memberJoin() throws Exception{
        MemberVO member = new MemberVO();

        member.setUserId(123);
        member.setEmail("sds");
        member.setPassword("1sds");
        member.setName("나나");
        member.setBirth(20201021);
        member.setMemberAddr("대구");
        member.setSex("F");
        member.setSchool("eo");
        member.setSchoolState("ds");
        member.setUniversity("sdsds");
        member.setDepartment("ss");
        member.setMbti("ENFP");

        membermapper.memberJoin(member);
    }
}
