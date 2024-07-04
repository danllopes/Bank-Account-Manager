import Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        char option;
        double deposit;
        Account account;

        System.out.print("\nEnter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        do {
            System.out.print("Is there an initial deposit (y/n)? ");
            option = sc.next().charAt(0);
        } while(option != 'y' && option != 'n');

        if(option == 'y') {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            account = new Account(name, number, deposit);
        } else {
            account = new Account(name, number);
        }

        System.out.println("\nAccount data:\n" +
                           account);

        System.out.print("\nEnter a deposit value: ");
        deposit = sc.nextDouble();

        account.deposit(deposit);

        System.out.println("Updated account data:\n" +
                           account);

        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();

        account.withdraw(withdraw);

        System.out.println("Updated account data:\n" +
                           account);

        sc.close();
    }
}