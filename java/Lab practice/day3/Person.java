package com.day;

class Person1 {
    String firstName;
    String lastName;

    Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employees extends Person1 {
    String jobTitle;
    int employeeId;

    Employees(String firstName, String lastName, String jobTitle, int employeeId) {
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.employeeId = employeeId;
    }

    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    int getEmployeeId() {
        return employeeId;
    }
}

public class Person{
    public static void main(String[] args) {
        Employees employee = new Employees("John", "Doe", "Engineer", 12345);
        System.out.println("Employee Full Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
       
}
}