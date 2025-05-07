package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {
    }
    public static void employees(){
        Employee employee1 = new Employee("90","james","food", 19.50, 35);
        System.out.println("your total pay is: "+employee1.getTotalPay());
    }
    public static void rooms(){
        Room room1 = new Room(2, 100.90, false,false);
        System.out.println("availibility: "+room1.isAvailable());
    }
    public static void reservations(){
        Reservation reservation1 = new Reservation("king",139.00,4, false);
        System.out.println("your total is: " + reservation1.getReservationTotal());
    }
}
