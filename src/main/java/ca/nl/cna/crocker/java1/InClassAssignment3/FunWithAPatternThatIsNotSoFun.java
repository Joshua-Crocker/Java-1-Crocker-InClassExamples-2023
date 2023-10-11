package ca.nl.cna.crocker.java1.InClassAssignment3;

import java.util.Scanner;

public class FunWithAPatternThatIsNotSoFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fun with patterns and fib and numbers!");

        System.out.println("Enter a number: ");
        int userNum = input.nextInt();

        int firstNum;
        int lastNum = 1;

        for (int i = 0; i <= userNum; i = firstNum) {
            System.out.printf("%d ", i);
            firstNum = lastNum;
            lastNum += i;
        }
    }
}
