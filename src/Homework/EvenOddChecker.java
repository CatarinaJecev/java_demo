package Homework;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " является чётным числом.");
        } else {
            System.out.println(number + " является нечётным числом.");
        }

        scanner.close();
    }
}
