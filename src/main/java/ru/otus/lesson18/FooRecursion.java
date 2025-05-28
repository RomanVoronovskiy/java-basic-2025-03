package ru.otus.lesson18;

public class FooRecursion {
    public static void main(String[] args) {
        f(4);
    }

    private static void f(int n) {
        System.out.println(n);
        if(n>=3){
            f(n-1);
            f(n-2);
            f(n-2);
        }
    }
}
