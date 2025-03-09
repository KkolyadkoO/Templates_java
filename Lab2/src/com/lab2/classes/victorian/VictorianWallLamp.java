package com.lab2.classes.victorian;

import com.lab2.interfaces.IWallLamp;

public class VictorianWallLamp implements IWallLamp {
    @Override
    public void mount() {
        System.out.println("Установлено викторианское бра");
    }
}
