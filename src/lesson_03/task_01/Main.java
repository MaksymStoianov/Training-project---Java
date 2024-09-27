package lesson_03.task_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Вы ввели: " + number);
    }
}
