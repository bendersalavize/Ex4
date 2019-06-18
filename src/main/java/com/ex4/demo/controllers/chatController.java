package com.ex4.demo.controllers;

import com.ex4.demo.repo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class chatController {

    @GetMapping("/")
    public String main(Model model, User user)
    {
        return "register";
    }
}
