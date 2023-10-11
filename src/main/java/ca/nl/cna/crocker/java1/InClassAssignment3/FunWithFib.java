package ca.nl.cna.crocker.java1.InClassAssignment3;

public class FunWithFib {
    public static void main(String[] args) {
        System.out.println("Fun with FIB");
        int firstNum;
        int lastNum = 1;

        for (int i = 0; i <= 13; i = firstNum) {
            System.out.printf("%d ", i);
            firstNum = lastNum;
            lastNum += i;

        }

    }
}
