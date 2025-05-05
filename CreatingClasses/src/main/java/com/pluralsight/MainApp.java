package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {

        Reservation reservation = new Reservation(roomType, price, numberOfNights, isWeekend, reservationTotal);
        Employee employee = new Employee(employeeId, name, department, payRate, hoursWorked);
        Room room = new Room(numberOfBeds, price, isDirty, isAvailable);
    }
}
