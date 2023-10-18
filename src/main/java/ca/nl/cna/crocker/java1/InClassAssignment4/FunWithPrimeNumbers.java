package ca.nl.cna.crocker.java1.InClassAssignment4;

import java.util.Scanner;

import static ca.nl.cna.crocker.java1.InClassAssignment4.PrimeNumberCalculator.isPrime;
import static ca.nl.cna.crocker.java1.InClassAssignment4.PrimeNumberCalculator.getUniquePrimeFactorization;

public class FunWithPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Enter an option:\s
                 1. Print all prime numbers up to a specific number\s
                2. Print all prime numbers between 2 numbers\s
                3. Print the unique prime factorization of a number\s
                4. Print all of the unique prime factorization of every number up to a specific number""");
        int option = scanner.nextInt();

        // 1st option
        if (option == 1) {
            System.out.println("Enter a number:");
            int maxNum = scanner.nextInt();
            int i = 0;
            do {
                if (isPrime(i)){
                    System.out.printf("%d is a prime num \n", i);
                }
                i++;
            } while (maxNum >= i);
        }

        else if (option == 2) {
            System.out.println("Enter the first number: ");
            int firstNum = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNum = scanner.nextInt();

            do {
                if (isPrime(firstNum)){
                    System.out.printf("%d is a prime num \n", firstNum);
                }
                firstNum++;
            } while (secondNum >= firstNum);
        }

        else if (option == 3) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();

            getUniquePrimeFactorization(num);
        }

        else if (option == 4) {
            System.out.println("Enter the first number: ");
            int firstNum = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int secondNum = scanner.nextInt();

            do {
                System.out.print("\n");
                System.out.printf("The prime factors of %d are: ", firstNum);
                getUniquePrimeFactorization(firstNum);
                firstNum++;
            } while (secondNum >= firstNum);
        }
    }
}
