package com.pluralsight;

import java.time.LocalDateTime;

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
    public void punchInTime(double time){
        this.startTime = time;
    }
    public void punchOutTime(double time){
        if (time> startTime){
            hoursWorked+= time - startTime;
        }else{
            throw new IllegalArgumentException("end time must be greater than start time");
        }
    }
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        this.startTime =now.getHour() + now.getMinute() / 60;
    }
    public void punchOut() {
        LocalDateTime now =LocalDateTime.now();
        double endtime = now.getHour() + now.getMinute() / 60;
        if (endtime > startTime){
            hoursWorked += endtime - startTime;
        }else{
            throw new IllegalArgumentException("end time must be greater than start time");

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
