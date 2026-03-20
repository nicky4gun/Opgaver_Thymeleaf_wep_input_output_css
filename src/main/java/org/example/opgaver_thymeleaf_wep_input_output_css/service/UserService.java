package org.example.opgaver_thymeleaf_wep_input_output_css.service;

import org.example.opgaver_thymeleaf_wep_input_output_css.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
