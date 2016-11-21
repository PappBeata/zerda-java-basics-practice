package com.garden;

import java.util.ArrayList;

public class Garden extends ArrayList<Plant> {

    final String formatForWater ="Watering with %d\n";

    public Garden (){

    }
    public void water(int amount){
        System.out.printf(String formatForWater, amount);
        //for (int i:Garden)
    }
}
