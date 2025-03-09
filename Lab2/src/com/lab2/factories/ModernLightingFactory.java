package com.lab2.factories;

import com.lab2.interfaces.ILightingFactory;
import com.lab2.classes.modern.*;
import com.lab2.interfaces.*;

public class ModernLightingFactory implements ILightingFactory {
    @Override
    public ILamp createLamp() {
        return new ModernLamp();
    }

    @Override
    public IChandelier createChandelier() {
        return new ModernChandelier();
    }

    @Override
    public IWallLamp createWallLamp() {
        return new ModernWallLamp();
    }

    @Override
    public IFloorLamp createFloorLamp() {
        return new ModernFloorLamp();
    }
}