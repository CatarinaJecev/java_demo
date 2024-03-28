package Homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        // Сумма чисел
        double sum = num1 + num2;
        System.out.println("Сумма чисел: " + sum);

        // Среднее значение
        double average = sum / 2;
        System.out.println("Среднее значение: " + average);

        // Результат сравнения
        String comparisonResult = (num1 == num2) ? "Числа равны" : "Числа не равны";
        System.out.println("Результат сравнения: " + comparisonResult);

        scanner.close();
    }
}
