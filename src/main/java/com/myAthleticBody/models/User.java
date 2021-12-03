package com.myAthleticBody.models;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private long id;
    private String email;
    private String password;
    private UserProfile userProfile;
    private ArrayList<Integer> idPrograms;

    public User() {
    }

    public User(long id, String email, String password, UserProfile userProfile, ArrayList<Integer> idPrograms) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userProfile = userProfile;
        this.idPrograms = idPrograms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public ArrayList<Integer> getIdPrograms() {
        return idPrograms;
    }

    public void setIdPrograms(ArrayList<Integer> idPrograms) {
        this.idPrograms = idPrograms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(email, user.email) && Objects.equals(password, user.password) &&
                Objects.equals(userProfile, user.userProfile) && Objects.equals(idPrograms, user.idPrograms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, userProfile, idPrograms);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userProfile=" + userProfile +
                ", idPrograms=" + idPrograms +
                '}';
    }
}
