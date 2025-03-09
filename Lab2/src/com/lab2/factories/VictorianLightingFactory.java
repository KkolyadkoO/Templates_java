package com.lab2.factories;

import com.lab2.classes.victorian.*;
import com.lab2.interfaces.*;

public class VictorianLightingFactory implements ILightingFactory {
    @Override
    public ILamp createLamp() {
        return new VictorianLamp();
    }

    @Override
    public IChandelier createChandelier() {
        return new VictorianChandelier();
    }

    @Override
    public IWallLamp createWallLamp() {
        return new VictorianWallLamp();
    }

    @Override
    public IFloorLamp createFloorLamp() {
        return new VictorianFloorLamp();
    }
}
