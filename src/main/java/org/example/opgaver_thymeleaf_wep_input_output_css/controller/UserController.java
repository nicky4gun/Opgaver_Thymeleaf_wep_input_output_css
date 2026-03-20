package org.example.opgaver_thymeleaf_wep_input_output_css.controller;

import org.example.opgaver_thymeleaf_wep_input_output_css.models.User;
import org.example.opgaver_thymeleaf_wep_input_output_css.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("colors", List.of("Red", "Green", "Blue","Yellow"));
        model.addAttribute("interests", List.of("Sport","Art","Programming","Gaming","Music"));

        return "register";
    }

    @PostMapping("/register")
    public String  registerUser(@ModelAttribute User user, Model model) {
        userService.addUser(user);
        model.addAttribute("user", user);
        return "confirmation";
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }
}
