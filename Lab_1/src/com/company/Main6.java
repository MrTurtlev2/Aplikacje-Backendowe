package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

public class Main6 {

    public static void main(String[] args) {

            int lineIndex = 1;

            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(
                        "manylines.txt"));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(lineIndex + ". " + line);

                    line = reader.readLine();
                    lineIndex++;
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
