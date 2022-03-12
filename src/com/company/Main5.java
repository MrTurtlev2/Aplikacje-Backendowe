package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main5 {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("local date " + dtf.format(now));
    }
}
