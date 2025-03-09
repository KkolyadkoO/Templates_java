package com.lab2.classes.modern;

import com.lab2.interfaces.IChandelier;

public class ModernChandelier implements IChandelier {
    @Override
    public void hang() {
        System.out.println("Подвешена люстра в стиле модерн");
    }
}
