package ru.otus.lesson19.example4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("files/demo.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader in = new InputStreamReader(bis)) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
