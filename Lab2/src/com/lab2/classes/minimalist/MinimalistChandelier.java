package com.lab2.classes.minimalist;

import com.lab2.interfaces.IChandelier;

public class MinimalistChandelier implements IChandelier {
    @Override
    public void hang() {
        System.out.println("Подвешена минималистская люстра");
    }
}
