package com.pluralsight;

public class Employee {
    private String employeeId();
    private String name();
    private String department();
    private float payRate();
    private int hoursWorked();

    public Employee(String employeeId, String name, String department, float payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }
}
