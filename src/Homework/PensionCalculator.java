package Homework;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class PensionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш пол (м/ж): ");
        String gender = scanner.nextLine();

        System.out.println("Введите ваш текущий возраст: ");
        int age = scanner.nextInt();

        int retirementAge = (gender.equalsIgnoreCase("м")) ? 70 : 65;

        int yearsToRetirement = retirementAge - age;
        int yearsSinceRetirement = age - retirementAge;

        if (yearsToRetirement > 0) {
            System.out.println("До выхода на пенсию осталось " + yearsToRetirement + " лет.");
        } else if (yearsSinceRetirement > 0) {
            System.out.println("Вы уже на пенсии " + yearsSinceRetirement + " лет.");
        } else {
            System.out.println("Вы находитесь на пенсии.");
        }

        scanner.close();
    }
}

