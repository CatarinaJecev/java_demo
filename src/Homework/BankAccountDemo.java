package Homework;

class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current balance: " + balance);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount account1 = new BankAccount(1001, 500.0);
        BankAccount account2 = new BankAccount(1002, 1000.0);

        // Performing operations on account1
        account1.deposit(200);
        account1.withdraw(50);

        // Performing operations on account2
        account2.deposit(300);
        account2.withdraw(200);

        // Checking final balances
        System.out.println("Final balance for account1: " + account1.getBalance());
        System.out.println("Final balance for account2: " + account2.getBalance());
    }
}

