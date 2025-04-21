package ru.otus.lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] animal = {"Собака", "Кошка", "Лев", "Тигр", "Слон",
                "Медведь", "Волк", "Лиса", "Заяц", "Олень", "Крокодил",
                "Обезьяна", "Жираф", "Зебра", "Бегемот", "Панда",
                "Пингвин", "Орёл", "Дельфин", "Черепаха"};

        Scanner scanner = new Scanner(System.in);
        int randomIndex = (int) (Math.random() * animal.length);
        String wordToGuess = animal[randomIndex];
        char[] toGuess = wordToGuess.toCharArray();

//        taskOne();
//        taskTwo(scanner, wordToGuess, toGuess);
//        taskThree(toGuess, scanner);
//        taskFour();
    }

    /**
     * Консольное приложение"Рюкзак"
     */
    private static void taskFour() {
        BackPack backPack = new BackPack();
        backPack.openBackPack();
        System.out.println(Arrays.toString(backPack.getAllItems()));
        System.out.println("У нас в рюкзаке " +
                backPack.countItems() + " предметов");
        backPack.addItem("Бутерброд");
        backPack.addItem("Бутерброд2");
        backPack.addItem("Бутерброд3");
        System.out.println(Arrays.toString(backPack.getAllItems()));
        System.out.println("У нас в рюкзаке " +
                backPack.countItems() + " предметов");
        backPack.deleteItem("Бутерброд2");
        System.out.println(Arrays.toString(backPack.getAllItems()));
        System.out.println("У нас в рюкзаке " +
                backPack.countItems() + " предметов");
    }

    /**
     * Консольнаяигра"Полечудес"
     *
     * @param toGuess загаданное слово
     * @param scanner сканнер
     */
    private static void taskThree(char[] toGuess, Scanner scanner) {
        boolean win = false;
        char[] result = new char[toGuess.length];
        Arrays.fill(result, '*');
        System.out.println(Arrays.toString(result));
        while (!win) {
            System.out.println("\nВведи букву: ");
            char letter = scanner.next().charAt(0);
            System.out.println("Слово выглядит так:");
            for (int i = 0; i < toGuess.length; i++) {
                if (letter == toGuess[i]) {
                    result[i] = letter;
                }
            }
            System.out.println(Arrays.toString(result));
            if (arrayNotContainsStar(result)) {
                win = true;
            }
        }
    }

    private static boolean arrayNotContainsStar(char[] result) {
        for (char elem : result) {
            if (elem == '*') {
                return false;
            }
        }
        return true;
    }

    /**
     * Консольнаяигра"Угадайслово"
     * @param scanner сканнер
     * @param wordToGuess загаданное слово
     * @param toGuess загаданное слово в виде массива char
     */
    private static void taskTwo(Scanner scanner, String wordToGuess, char[] toGuess) {
        boolean win = false;
        while (!win) {
            System.out.println("Введи слово: ");
            String inputAnimal = scanner.next();
            if (wordToGuess.equalsIgnoreCase(inputAnimal)) {
                System.out.println("Угадали");
                win = true;
            } else {
                char[] input = inputAnimal.toCharArray();
                int minLength = Math.min(toGuess.length, input.length);
                for (int i = 0; i < minLength; i++) {
                    if (String.valueOf(toGuess[i]).equalsIgnoreCase(String.valueOf(input[i]))) {
                        System.out.print(toGuess[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                for (int i = 0; i < (10 - minLength); i++) {
                    System.out.print("*");
                }
                System.out.println("\nНе угадал, попрубуй ещё раз!");
            }
        }
    }


    /**
     * @apiNote метод решает 1 задачу из презентации
     */
    private static void taskOne() {
        int[] mass = {2, 3, 7, 1, 4, 5, 6};

        int max = getMaxElem(mass);
        System.out.println("max = " + max);
        int min = getMinElem(mass);
        System.out.println("min = " + min);
    }

    private static int getMaxElem(int[] mass) {
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        return max;
    }

    private static int getMinElem(int[] mass) {
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        return min;
    }
}