package lab6.task3.models;

import lab6.task3.factories.VehicleTypeFactory;
import lab6.task3.interfaces.VehicleType;

public class Vehicle {
    private String licensePlate;
    private String owner;
    private int year;
    private VehicleType type;

    public Vehicle(String licensePlate, String owner, int year,
                   String type, String fuelType) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.year = year;
        this.type = VehicleTypeFactory.getVehicleType(type, fuelType);
    }

    public void display() {
        String uniqueInfo = "Номер: " + licensePlate +
                            ", Владелец: " + owner +
                            ", Год: " + year;
        type.display(uniqueInfo);
    }
}
