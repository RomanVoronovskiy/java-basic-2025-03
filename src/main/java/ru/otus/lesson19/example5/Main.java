package ru.otus.lesson19.example5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String data = "Hello World New";
        byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
        try (FileOutputStream out = new FileOutputStream("files/out1.txt",false)) {
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
