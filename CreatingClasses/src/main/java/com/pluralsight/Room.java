package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isDirty;
    private boolean isAvailable;
    private double checkInTime;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isAvailable;
    }
    public boolean isOccupied() {
        return !isAvailable();
    }
    public boolean isClean() {
        return !isDirty;
    }
    public void checkIn() {
        isDirty = true;
        isAvailable = false;
    }
    public void checkOut() {
       cleanRoom();
       isAvailable = true;
    }
    public void cleanRoom(){
        isDirty = false;
    }
    public Room(int numberOfBeds, double price, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;

    }
}
