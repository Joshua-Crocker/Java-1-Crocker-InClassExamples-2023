package ca.nl.cna.crocker.java1.InClassAssignment2;

import java.util.Scanner;

public class funWithEmployees {
    public static void main(String[] args) {
        System.out.println("Fun with employees");
        Scanner input = new Scanner(System.in);

        double salaryTotal = 0;
        int employeeCounter = 0;
        final int NUM_EMPLOYEES = 3;
        Employee employee = new Employee("", "", 0.0);

        while (employeeCounter < NUM_EMPLOYEES) {
            System.out.println("Enter the first name: ");
            String firstName = input.next();
            employee.setFirstName(firstName);

            System.out.println("Enter the last name: ");
            String lastName = input.next();
            employee.setLastName(lastName);

            System.out.println("Enter the salary: ");
            double annualSalary = input.nextDouble();
            employee.setAnnualSalary(annualSalary);

            employee.giveRaise(0.08);

            System.out.printf("This employee is: %s %s\n", employee.getFirstName(), employee.getLastName());
            System.out.printf("This employee makes: %,.2f\n", employee.getAnnualSalary());
            employeeCounter++;
            salaryTotal += employee.getAnnualSalary();
        }
        double salaryAverage = salaryTotal / NUM_EMPLOYEES;
        System.out.printf("The average salary at this company is: %,.2f", salaryAverage);
    }
}
