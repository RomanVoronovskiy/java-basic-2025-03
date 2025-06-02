package ru.otus.lesson19;


import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        File file = new File("src/main/java/ru/otus/java/basic");
        System.out.println("exists :" + file.exists());
        System.out.println("canRead : " + file.canRead());
        System.out.println("canWrite : " + file.canWrite());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.length() = " + file.length());
        System.out.println("file.listFiles() = " + Arrays.toString(file.listFiles()));
        File fileDelete = new File("files/out1.txt");
        System.out.println(fileDelete.delete());

        File fileMake = new File("src/main/java/ru/otus/java/basic/lesson19/qwe/files");
        fileMake.mkdirs();
    }

}