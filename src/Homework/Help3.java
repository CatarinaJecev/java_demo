package Homework;

import java.io.IOException;

public class Help3 {
    public static void main(String args[]) throws IOException {
        char choice, ignore;

        for (;;) {
            do {
                System.out.println("Cпpaвкa:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.print("Bыбepитe (q - выход): ");
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(choice < '1' || choice > '7' && choice != 'q');

            if (choice == 'q') break; // Выход из цикла, если выбрана буква q

            // Обработка выбора пользователя
            switch(choice) {
                case '1':
                    System.out.println("Описание оператора if:");
                    // Описание оператора if
                    break;
                case '2':
                    System.out.println("Описание оператора switch:");
                    // Описание оператора switch
                    break;
                case '3':
                    System.out.println("Описание оператора for:");
                    // Описание оператора for
                    break;
                case '4':
                    System.out.println("Описание оператора while:");
                    // Описание оператора while
                    break;
                case '5':
                    System.out.println("Описание оператора do-while:");
                    // Описание оператора do-while
                    break;
                case '6':
                    System.out.println("Описание оператора break:");
                    // Описание оператора break
                    break;
                case '7':
                    System.out.println("Описание оператора continue:");
                    // Описание оператора continue
                    break;
            }
        }
    }
}

