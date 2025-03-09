package com.lab2.classes.victorian;

import com.lab2.interfaces.IChandelier;

public class VictorianChandelier implements IChandelier {
    @Override
    public void hang() {
        System.out.println("Подвешена викторианская люстра");
    }
}