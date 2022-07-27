package com.bridelabz;

import java.util.ArrayList;

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

}
