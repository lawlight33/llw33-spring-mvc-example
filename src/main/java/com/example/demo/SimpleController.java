package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ww")
public class SimpleController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("user", new User(123));
        return "main";
    }

    public static class User {
        private final int id;
        public User(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }
    }
}
