package com.lab2.classes.minimalist;

import com.lab2.interfaces.IWallLamp;

public class MinimalistWallLamp implements IWallLamp {
    @Override
    public void mount() {
        System.out.println("Установлено минималистское бра");
    }
}
