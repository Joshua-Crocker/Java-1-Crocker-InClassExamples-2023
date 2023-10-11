package ca.nl.cna.crocker.java1.InClassExamples;

import java.util.Scanner;

public class FunWithSavingsAccount {
    public static void main(String[] args) {
        System.out.println("Fun with savings account");

        SimpleSavingsAccount simpleSavingsAccount = new SimpleSavingsAccount("Joshua");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount to deposit: ");
        double amount = input.nextDouble();
        simpleSavingsAccount.deposit(amount);



        System.out.printf("This account belongs to %s\n", simpleSavingsAccount.getName());
        System.out.printf("Savings balance: %.2f", simpleSavingsAccount.getBalance());

    }
}
