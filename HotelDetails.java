package com.bridelabz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelDetails {
    ArrayList<Hotel> myHotelList = new ArrayList();

    public void addHotel() {

        Hotel LakeWood = new Hotel("LakeWood", 110, 80, 90, 80, 3);
        Hotel BridgeWood = new Hotel("BridgeWood", 150, 110, 50, 50, 4);
        Hotel RidgeWood = new Hotel("RidgeWood", 220, 100, 150, 40, 5);

        myHotelList.add(LakeWood);
        myHotelList.add(BridgeWood);
        myHotelList.add(RidgeWood);

        System.out.println(myHotelList);
    }

    public void findCheapestHotelOne(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRegularRate)).findFirst();

        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekdayRegularRate() * numberOfDays);
        System.out.println("HotelName :" + hotel.getHotelName());
        System.out.println("NumberOfDaysStayed  WeekdayRegularRate :" + hotel.getTotal() + "$");

    }
}
