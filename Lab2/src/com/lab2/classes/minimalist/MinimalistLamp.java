package com.lab2.classes.minimalist;

import com.lab2.interfaces.ILamp;

public class MinimalistLamp implements ILamp {
    @Override
    public void turnOn() {
        System.out.println("Включена минималистская лампа");
    }
}
