package com.garden;

import java.util.ArrayList;

public abstract class Plant {

    String name;
    String color;

    public Plant (String color){
        name = getClass().getSimpleName();
        System.out.println ("The " + color + " " + name + " needs water");

    }



}
