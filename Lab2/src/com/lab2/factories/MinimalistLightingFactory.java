package com.lab2.factories;

import com.lab2.classes.minimalist.*;
import com.lab2.interfaces.*;

public class MinimalistLightingFactory implements ILightingFactory {
    @Override
    public ILamp createLamp() {
        return new MinimalistLamp();
    }

    @Override
    public IChandelier createChandelier() {
        return new MinimalistChandelier();
    }

    @Override
    public IWallLamp createWallLamp() {
        return new MinimalistWallLamp();
    }

    @Override
    public IFloorLamp createFloorLamp() {
        return new MinimalistFloorLamp();
    }
}
