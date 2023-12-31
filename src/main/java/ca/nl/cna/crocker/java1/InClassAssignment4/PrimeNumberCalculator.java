//Prime Numbers
//
//        A natural number (positive Integer) is prime if it’s divisible by only 1 and itself. For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime. (Hint: use the Mod operator - if a number x divides another number y and the remainder is 0 and x>=2 then x divides y and therefore y is not prime.) Every integer has a unique representation of primes called it’s Unique Prime Factorization. For example 8 has a unique prime factorization of 2*2*2 and 25 has 5*5.
//
//        Write a class called PrimeNumberCalculator that does the following:
//
//        Has a method called isPrime that determines whether an integer is prime
//
//        Has method called getUniquePrimeFactorization that returns the unique prime factorization of an integer as a String.
//
//        Create an application that application that does the following:
//
//        Determines and displays all the prime numbers up to a value input by the user (ie. Print all primes up to 1,000)
//
//        Prints all primes between two numbers (ie. Print all primes between 500 and 10,000)
//
//        Prints the unique prime factorization of a number input by the user. (ie. Print the prime factorization of 226)
//
//        Prints the unique prime factorization of all numbers up to a limit input by a user. (Ie. Print the prime factorization of all numbers up to 500)
//
//        Has a nice console interface to manage these options.


package ca.nl.cna.crocker.java1.InClassAssignment4;

public class PrimeNumberCalculator {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getUniquePrimeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int currentNum = n;
                while (currentNum % i == 0) {
                    System.out.print(i + " ");
                    currentNum = currentNum / i;
                }
            }
        }
    }
}
