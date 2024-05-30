package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Service.Userservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestBody;

@Controller // 해당 클래스가 Spring MVC Controller임을 명시
public class UserController {

    @GetMapping("/signup") // GET 요청이 /signup으로 들어왔을 때 해당 메소드 실행
    public String signup() {
        return "signup"; // signup.html 파일을 뷰로 사용
    }
    private final Userservice userService;

    @Autowired // Spring이 자동으로 빈을 해당 필드나 메소드에 연결해야함을 나타낸다
    public UserController(Userservice Userservice) {
        this.userService = Userservice;
    }

    @PostMapping("/users")
    public String createUser(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signup";
        }
        userService.createUser(user);
        return "redirect:/home";
    }
}