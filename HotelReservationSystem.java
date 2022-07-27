package com.bridelabz;

public class HotelReservationSystem {
    public static void main(String[] args) {
        System.out.println("~~~~~~~Welcome to Hotel Reservation System~~~~~~~");
        HotelDetails hotelDetails = new HotelDetails();
        hotelDetails.addHotel();

        System.out.println();
        System.out.println("Cheapest Hotel Based on Weekday Regular Rate");
        hotelDetails.findCheapestHotelOne("10-Sep-2020", "11-Sep-2020");
        System.out.println(" ");

        System.out.println("Cheapest Hotel Based on Weekday Regular Rate");
        hotelDetails.findCheapestHotelTwo("11-Sep-2020", "12-Sep-2020");
        System.out.println(" ");

        System.out.println("Cheapest best Rated Hotel Based on WeekendRegularRate");
        hotelDetails.findCheapestHotelRating("11-Sep-2020", "12-Sep-2020");
        System.out.println(" ");
    }

}
