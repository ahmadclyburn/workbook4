package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isDirty;
    private boolean isOccupied;

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
        return !isDirty && !isOccupied;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public boolean isClean() {
        return !isDirty;
    }
    public void checkIn() {
        this.isDirty = true;
        this.isOccupied = true;
    }
    public void checkOut() {
       cleanRoom();
    }
    public void cleanRoom(){
        isDirty = false;
    }
    public Room(int numberOfBeds, double price, boolean isDirty, boolean isOccupied) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isDirty = isDirty;
        this.isOccupied =isOccupied;
    }
}
