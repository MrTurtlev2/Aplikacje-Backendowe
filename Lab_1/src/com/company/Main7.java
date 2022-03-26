package com.company;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Main7 {

    public static void main(String[] args) {
        System.out.println("efef");

        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("John", 21);
        String userJson = objectMapper.writeValueAsString(userObject);

        System.out.println(userJson);
    }
}

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}