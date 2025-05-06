package com.pluralsight;

public class Reservation {

    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;
    private int checkInTime;
    public String getRoomType() {

        return roomType;
    }
    public void setRoomType(String roomType) {

        if (roomType.equalsIgnoreCase("king")) {
            this.pricePerNight = 139.00;
            this.roomType = "king";
        }else if(roomType.equalsIgnoreCase("Double")){
            this.pricePerNight =124.00;
            this.roomType ="Double";
        }else{
            throw new IllegalArgumentException("invalid room type");
        }
    }
    public double getPricePerNight() {
       if (isWeekend){
           return pricePerNight * 1.10;
       }
        return pricePerNight;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend() {
        return isWeekend;
    }
    public void setIsWeekend(boolean isWeekend){
        this.isWeekend =isWeekend;
    }
    public double getReservationTotal() {
        return numberOfNights * pricePerNight;
    }

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.pricePerNight = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }
}
