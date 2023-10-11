package ca.nl.cna.crocker.java1.InClassAssignment2;

public class Employee {
    private String firstName;
    private String lastName;
    private double annualSalary;

    public Employee(String firstName, String lastName, double annualSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (annualSalary >= 0) {
            this.annualSalary = annualSalary;
        } else {
            this.annualSalary = 0;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary >= 0) {
            this.annualSalary = annualSalary;
        } else {
            this.annualSalary = 0;
        }
    }

    public void giveRaise(double percent) {
        this.annualSalary = this.annualSalary + this.annualSalary * percent;
    }
}
