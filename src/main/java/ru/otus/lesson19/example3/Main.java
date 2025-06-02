package ru.otus.lesson19.example3;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("files/demo.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int n = bis.read();
            while (n != -1) {
                System.out.print((char) n);
                n = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
