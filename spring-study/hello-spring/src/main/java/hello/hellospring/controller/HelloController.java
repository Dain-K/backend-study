package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // web application 에서 /hello 로 들어올 경우 아래의 method 를 호출
    // 정적 컨텐츠 방식
    @GetMapping("hello")
    public String hello(Model model){ // Spring이 만들어주는 Model
        model.addAttribute("data", "hello!!"); // model에 data  hello!! 를 넣어준다
        return "hello"; // resources:templates/ + {ViewName} + .html 파일을 찾아 데이터를 넣어줌
    }

    // MVC 반식
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    // API 방식
    @GetMapping("hello-string")
    @ResponseBody // 중요, html 응답 body 부분에 data를 직접 넣어준다는 것을 명시함
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; // "hello spring"
        // 위 방식과의 차이는 View를 사용하지 않고 그냥 데이터를 보내준다는 것이다.
        // html 파일을 만들지 않아도 데이터를 웹에 출력한다.
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    public class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
