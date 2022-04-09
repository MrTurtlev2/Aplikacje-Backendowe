package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@SpringBootApplication
public class AllUsers {

    ArrayList<UserModel> employeeList = new ArrayList<UserModel>();
    UserModel employee = new UserModel("Marek", 22, 80);



    @GetMapping("/users/all")
    @ResponseBody
    public UserModel index() {
        return employee;
    }
}
