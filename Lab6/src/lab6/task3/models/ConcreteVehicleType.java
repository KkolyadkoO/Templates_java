package lab6.task3.models;

import lab6.task3.interfaces.VehicleType;

public class ConcreteVehicleType implements VehicleType {
    private String type;
    private String fuelType;

    public ConcreteVehicleType(String type, String fuelType) {
        this.type = type;
        this.fuelType = fuelType;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void display(String uniqueInfo) {
        System.out.println("Тип: " + type +
                           ", Топливо: " + fuelType +
                           ", Уникальные данные: " + uniqueInfo);
    }
}