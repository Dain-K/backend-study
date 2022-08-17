package com.testproject.jpa.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data // @Getter @Setter @ToString 를 포함하여 위에 안적어도 동작함
@Builder
@Entity // PK가 반드시 필요하다는 의미이다. PK를 지정하지 않으면 오류 발생
public class User {
    @Id
    @GeneratedValue // 순차적으로 데이터를 빌드하기 위해
    private Long id; // long 은 자동으로 숫자 증가
    
    @NonNull // 무조건 값을 입력하도록 
    private String name; // 필수값
    
    @NonNull
    private String email; // 필수값
    
    private LocalDateTime createdAt; // 데이터베이스에 생성된 데이터가 언제 생성된지 명시해야한다.
    private LocalDateTime UpdatedAt;

}
