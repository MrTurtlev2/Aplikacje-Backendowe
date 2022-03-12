package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

            String text = "updated text";
            try (
                    FileOutputStream stream = new FileOutputStream("file.txt");
                    OutputStreamWriter writer = new OutputStreamWriter(stream, StandardCharsets.UTF_8);
            ) {
                writer.write(text);
                writer.flush(); // to force the data to be saved by the system and closing "connection"
            } catch (IOException ex) {
                ex.printStackTrace();
            }

    }
}
