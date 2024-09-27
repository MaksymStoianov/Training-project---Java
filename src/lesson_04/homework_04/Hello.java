package lesson_04.homework_04;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String text = getGreetingText(name);
        System.out.println(text);
    }

    public static String getGreetingText(String name) {
        return "Вы ввели: " + name;
    }
}
