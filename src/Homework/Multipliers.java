package Homework;

import java.util.Scanner;

public class Multipliers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();

        boolean hasMultipliers = false;

        System.out.printf("Число %d является произведением пар:%n", number);

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                hasMultipliers = true;
                System.out.printf("%d и %d%n", i, number / i);
            }
        }

        if (!hasMultipliers) {
            System.out.printf("Число %d не имеет множителей, поэтому это простое число.%n", number);
            System.out.println("Простое число (или простое) - натуральное число больше 1, которое не является произведением двух меньших натуральных чисел.");
        }

        scanner.close();
    }
}

