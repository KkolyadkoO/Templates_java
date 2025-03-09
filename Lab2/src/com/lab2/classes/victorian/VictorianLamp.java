package com.lab2.classes.victorian;

import com.lab2.interfaces.ILamp;

public class VictorianLamp implements ILamp {
    @Override
    public void turnOn() {
        System.out.println("Включена викторианская лампа");
    }
}

