package Homework;
import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество студентов: ");
        int numStudents = scanner.nextInt();

        // Объявляем переменные для хранения суммы оценок и счетчика студентов
        int totalScore = 0;
        int count = 0;

        // Ввод оценок для каждого студента
        while (count < numStudents) {
            System.out.println("Введите оценку студента " + (count + 1) + ": ");
            int score = scanner.nextInt();
            totalScore += score; // Увеличиваем общую сумму оценок
            count++; // Увеличиваем счетчик студентов
        }

        // Вычисляем средний балл
        double averageScore = (double) totalScore / numStudents;

        // Выводим результат
        System.out.println("Средний балл в группе: " + averageScore);

        scanner.close();
    }
}