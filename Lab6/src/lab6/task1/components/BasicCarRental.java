package lab6.task1.components;

import lab6.task1.interfaces.CarRental;

public class BasicCarRental implements CarRental {
    private String carModel;
    private double basePrice;

    public BasicCarRental(String carModel, double basePrice) {
        this.carModel = carModel;
        this.basePrice = basePrice;
    }

    @Override
    public String getDescription() {
        return "Прокат автомобиля: " + carModel;
    }

    @Override
    public double getCost() {
        return basePrice;
    }
}