package Homework;
import java.io.IOException;

public class Help2 {
    public static void main(String args[]) throws IOException {
        char choice, ignore;

        do {
            System.out.println("Cnpaвкa:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Bыбepитe: ");

            do {
                choice = (char) System.in.read();
            } while (choice == '\n');

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' || choice > '5');
    }
}
