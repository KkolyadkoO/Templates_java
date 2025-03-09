package com.lab2.classes.victorian;

import com.lab2.interfaces.IFloorLamp;

public class VictorianFloorLamp implements IFloorLamp {
    @Override
    public void place() {
        System.out.println("Установлен викторианский торшер");
    }
}
