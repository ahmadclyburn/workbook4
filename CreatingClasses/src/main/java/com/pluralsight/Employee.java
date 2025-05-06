package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public static final double employeeHoursBeforeOvertime = 40.0;
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public double getTotalPay(){
       double regularPay = hoursWorked * payRate;
        double overtimePay = hoursWorked * payRate * 1.5;
        return regularPay + overtimePay;
    }
    public double getRegularHours(){
        return Math.min(hoursWorked, employeeHoursBeforeOvertime);
    }
    public double getOvertimeHours(){
        return Math.max(0, hoursWorked - employeeHoursBeforeOvertime);
    }
    public void punchIn(double startTime){
        this.startTime = startTime;
    }
    public void punchOut(double endTime){
        if (endTime> startTime){
            hoursWorked+= endTime - startTime;
        }
    }
    public Employee(String employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }
}
