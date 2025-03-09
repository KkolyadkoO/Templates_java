package com.lab2.interfaces;

public interface ILightingFactory {
    ILamp createLamp();
    IChandelier createChandelier();
    IWallLamp createWallLamp();
    IFloorLamp createFloorLamp();
}