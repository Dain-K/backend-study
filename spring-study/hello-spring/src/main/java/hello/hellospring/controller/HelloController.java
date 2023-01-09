package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // web application 에서 /hello 로 들어올 경우 아래의 method 를 호출
    @GetMapping("hello")
    public String hello(Model model){ // Spring이 만들어주는 Model
        model.addAttribute("data", "hello!!"); // model에 data  hello!! 를 넣어준다
        return "hello"; // resources:templates/ + {ViewName} + .html 파일을 찾아 데이터를 넣어줌
    }
}
