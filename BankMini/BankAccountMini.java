package LexiconRehearsals.BankDemos.BankMini;

import java.util.Scanner;


public class BankAccountMini {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput;
        boolean quit = false;
        float balance = 0f;

        System.out.println("\nHere you can deposit money, withdraw money and " +
                "check your money balance.\n");
        do {
            System.out.println("1. Make a Deposit");
            System.out.println("2. Make a Withdraw");
            System.out.println("3. Check balance");
            System.out.print("0. Enter 0 to quit: ");

            userInput = scan.nextInt();
            System.out.println();

            switch (userInput) {
                case 1:
                    float amount;
                    System.out.print("Amount to deposit: ");
                    amount = scan.nextFloat();
                    if (amount <= 0)
                        System.out.println("Can't deposit a non positive amount.");
                    else {
                        balance += amount;
                        System.out.println("$" + amount + " payment has been deposited.");
                    }
                    break;

                case 2:
                    System.out.print("Amount to withdraw: ");
                    amount = scan.nextFloat();
                    if (amount <= 0 || amount > balance)
                        System.out.println("Withdrawal can't be completed.");
                    else {
                        balance -= amount;
                        System.out.println("$" + amount + " has been withdrawn.");
                    }
                    break;

                case 3:
                    System.out.println("Your balance: $" + balance);
                    break;

                case 0:
                    quit = true;
                    break;

                default:
                    System.out.println("Wrong choice.");
                    break;
            }
            System.out.println();

        } while (!quit);
        System.out.print("Thank you for using Bank Mini. Have a nice day.");
    }
}