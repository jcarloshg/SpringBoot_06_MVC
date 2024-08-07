package com.jcarloshg.mvc.model;

import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteSystem;

    public Student() {
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteSystem() {
        return favoriteSystem;
    }

    public void setFavoriteSystem(List<String> favoriteSystem) {
        this.favoriteSystem = favoriteSystem;
    }

    @Override
    public String toString() {
        String systems = favoriteSystem.stream()
                .map(system -> String.valueOf(system))
                .collect(Collectors.joining(",", "", ""));
        return "[[firstName: " + firstName + ", lastName: " + lastName + ", country: " + country + " language: "
                + favoriteLanguage + " Favorite systems: " + systems + "]]";
    }

}
