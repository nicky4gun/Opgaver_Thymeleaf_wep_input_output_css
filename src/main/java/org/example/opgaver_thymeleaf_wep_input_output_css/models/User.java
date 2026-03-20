package org.example.opgaver_thymeleaf_wep_input_output_css.models;

import java.util.List;

public class User {
    private String name;
    private String email;
    private String favoriteColor;
    private String gender;
    private List<String> interests;

    public User() {}

    public User(String name, String email, String favoriteColor, String gender, List<String> interests) {
        this.name = name;
        this.email = email;
        this.favoriteColor = favoriteColor;
        this.gender = gender;
        this.interests = interests;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
