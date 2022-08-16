package com.testproject.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Data // @Getter @Setter @ToString 를 포함하여 위에 안적어도 동작함
@Builder
public class User {
    @NonNull // 무조건 값을 입력하도록 
    private String name; // 필수값
    @NonNull
    private String email; // 필수값
    private LocalDateTime createdAt; // 데이터베이스에 생성된 데이터가 언제 생성된지 명시해야한다.
    private LocalDateTime UpdatedAt;

}
