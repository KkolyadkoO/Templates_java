package lab6.task3.factories;

import lab6.task3.interfaces.VehicleType;
import lab6.task3.models.ConcreteVehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleTypeFactory {
    private static Map<String, VehicleType> vehicleTypes = new HashMap<>();

    public static VehicleType getVehicleType(String type, String fuelType) {
        String key = type + "_" + fuelType;
        VehicleType vehicleType = vehicleTypes.get(key);

        if (vehicleType == null) {
            vehicleType = new ConcreteVehicleType(type, fuelType);
            vehicleTypes.put(key, vehicleType);
            System.out.println("Создан новый тип транспорта: " + key);
        }

        return vehicleType;
    }

    public static int getTypesCount() {
        return vehicleTypes.size();
    }
}