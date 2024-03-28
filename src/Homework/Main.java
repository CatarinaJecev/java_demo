package Homework;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaces = 0;

        System.out.println("Введите символы, закончите ввод точкой:");

        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');

        System.out.println("Количество пробелов: " + spaces);
    }
}