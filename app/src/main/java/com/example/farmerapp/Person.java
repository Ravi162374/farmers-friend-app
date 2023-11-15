package com.example.farmerapp;

public class Person {

    private String name;
    private String age;
    private String email;
    private String bio;

    public Person() {
        // Default constructor required for Firebase Realtime Database
    }

    public Person(String name, String age, String email, String bio) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.bio = bio;
    }

    // Getter and setter methods for the Person class variables

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
