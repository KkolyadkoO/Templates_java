package lab8.task3.models;

import lab8.task3.interfaces.TransportObserver;

public class Dispatcher implements TransportObserver {
    private String name;

    public Dispatcher(String name) {
        this.name = name;
    }

    @Override
    public void update(String vehicleId, String status, String location) {
        System.out.println("Диспетчер " + name + " получил обновление: " +
                           "Транспорт " + vehicleId + " - " + status +
                           " в " + location);

        if (status.equals("Авария")) {
            System.out.println("!!! ДИСПЕТЧЕР " + name + " ПРИНИМАЕТ МЕРЫ: Вызов служб спасения для " + vehicleId);
        } else if (status.equals("Задержка")) {
            System.out.println("Диспетчер " + name + " корректирует график для " + vehicleId);
        }
    }
}
