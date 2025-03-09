package com.lab2.client;

import com.lab2.factories.*;
import com.lab2.interfaces.*;

public class LightingClient {
    public static void main(String[] args) {
        ILightingFactory victorianFactory = new VictorianLightingFactory();
        createAndUseLighting(victorianFactory);

        ILightingFactory modernFactory = new ModernLightingFactory();
        createAndUseLighting(modernFactory);

        ILightingFactory minimalistFactory = new MinimalistLightingFactory();
        createAndUseLighting(minimalistFactory);
    }

    public static void createAndUseLighting(ILightingFactory factory) {
        ILamp lamp = factory.createLamp();
        IChandelier chandelier = factory.createChandelier();
        IWallLamp wallLamp = factory.createWallLamp();
        IFloorLamp floorLamp = factory.createFloorLamp();

        lamp.turnOn();
        chandelier.hang();
        wallLamp.mount();
        floorLamp.place();
        System.out.println("");
    }
}
