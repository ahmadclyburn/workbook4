package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class ReservationTest {

    public void testReservationTotalForWeekend(){
      Reservation reservation = new Reservation("king", 139.0, 3, true);
      double expectedTotal = reservation.getPricePerNight() *reservation.getNumberOfNights();
      assertEquals(expectedTotal, reservation.getReservationTotal(), .01);
    }

}