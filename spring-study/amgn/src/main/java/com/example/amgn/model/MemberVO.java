package com.example.amgn.model;

public class MemberVO {

    // 회원 번호
    private Integer user_id;

    // 회원 Id
    private String email;

    // 회원 pw
    private String password;

    // 회원 이름
    private String name;

    // 회원 생일
    private Integer birth;

    // 회원 거주지
    private String location;

    // 회원 성별
    private String sex;

    // 회원 학력
    private String school;

    // 회원 학력 상태
    private String school_state;

    // 회원 대학교
    private String university;

    // 회원 학과
    private String department;

    // 회원 mbti
    private String mbti;

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth){
        this.birth = birth;
    }

    public String getMemberAddr() {
        return location;
    }

    public void setMemberAddr(String location) {
        this.location = location;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolState() {
        return school_state;
    }

    public void setSchoolState(String school_state) {
        this.school_state = school_state;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMbti() {
        return mbti;
    }

    public void setMbti(String mbti) {
        this.mbti = mbti;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "user_id=" + user_id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", location='" + location + '\'' +
                ", sex='" + sex + '\'' +
                ", school='" + school + '\'' +
                ", school_state='" + school_state + '\'' +
                ", university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", mbti='" + mbti + '\'' +
                '}';
    }
}
