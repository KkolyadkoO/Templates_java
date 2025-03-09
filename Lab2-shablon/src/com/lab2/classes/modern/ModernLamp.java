package com.lab2.classes.modern;

import com.lab2.interfaces.ILamp;

public class ModernLamp implements ILamp {
    @Override
    public void turnOn() {
        System.out.println("Включена лампа в стиле модерн");
    }
}
