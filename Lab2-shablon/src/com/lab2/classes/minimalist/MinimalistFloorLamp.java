package com.lab2.classes.minimalist;

import com.lab2.interfaces.IFloorLamp;

public class MinimalistFloorLamp implements IFloorLamp {
    @Override
    public void place() {
        System.out.println("Установлен минималистский торшер");
    }
}
