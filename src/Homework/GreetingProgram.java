package Homework;

import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выводим список доступных языков
        System.out.println("Выберите язык (Введите номер):");
        System.out.println("1. Английский");
        System.out.println("2. Французский");
        System.out.println("3. Испанский");
        System.out.println("4. Немецкий");

        // Считываем выбор пользователя
        int choice = scanner.nextInt();

        // Выводим приветствие на выбранном языке
        switch (choice) {
            case 1:
                System.out.println("Hello!");
                break;
            case 2:
                System.out.println("Bonjour!");
                break;
            case 3:
                System.out.println("¡Hola!");
                break;
            case 4:
                System.out.println("Hallo!");
                break;
            default:
                System.out.println("Выбран неверный номер языка.");
        }

        scanner.close();
    }
}
