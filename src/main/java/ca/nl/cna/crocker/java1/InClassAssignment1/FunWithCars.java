package ca.nl.cna.crocker.java1.InClassAssignment1;

import java.util.Scanner;

public class FunWithCars {

    public static void main(String[] args) {
        System.out.println("lets have fun with cars!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name for the car: ");
        String name = input.next();

        System.out.println("Enter a model for the car: ");
        String model = input.next();

        System.out.println("Enter a year for the car: ");
        int year = input.nextInt();

        System.out.println("Enter a value for the car: ");
        double value = input.nextDouble();

        Car car = new Car(name, model, year, value);

        System.out.printf("InClassAssignment1.Car Information: %s, %s from %d. Value: %.2f", car.getName(), car.getModel(), car.getYear(), car.getValue());
    }
}
