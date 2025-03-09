package com.lab2.classes.modern;

import com.lab2.interfaces.IFloorLamp;

public class ModernFloorLamp implements IFloorLamp {
    @Override
    public void place() {
        System.out.println("Установлен торшер в стиле модерн");
    }
}
