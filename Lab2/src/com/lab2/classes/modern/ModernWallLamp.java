package com.lab2.classes.modern;

import com.lab2.interfaces.IWallLamp;

public class ModernWallLamp implements IWallLamp {
    @Override
    public void mount() {
        System.out.println("Установлено бра в стиле модерн");
    }
}