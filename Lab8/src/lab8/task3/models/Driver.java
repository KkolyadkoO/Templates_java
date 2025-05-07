package lab8.task3.models;

import lab8.task3.interfaces.TransportObserver;

public class Driver implements TransportObserver {
    private String name;
    private String vehicleId;

    public Driver(String name, String vehicleId) {
        this.name = name;
        this.vehicleId = vehicleId;
    }

    @Override
    public void update(String vehicleId, String status, String location) {
        if (this.vehicleId.equals(vehicleId)) {
            System.out.println("Водитель " + name + " получил уведомление о своем транспорте " +
                               vehicleId + ": " + status + " в " + location);

            if (status.equals("Назначен рейс")) {
                System.out.println("Водитель " + name + " начинает подготовку к рейсу");
            } else if (status.equals("Требуется заправка")) {
                System.out.println("Водитель " + name + " направляется на заправку");
            }
        }
    }
}
