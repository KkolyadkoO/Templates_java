package lab8.task3.models;

import lab8.task3.interfaces.TransportObserver;
import lab8.task3.interfaces.TransportSubject;

import java.util.ArrayList;
import java.util.List;

public class TransportVehicle implements TransportSubject {
    private String vehicleId;
    private String status;
    private String location;
    private List<TransportObserver> observers = new ArrayList<>();

    public TransportVehicle(String vehicleId) {
        this.vehicleId = vehicleId;
        this.status = "В гараже";
        this.location = "Гараж";
    }

    public void updateStatus(String newStatus, String newLocation) {
        this.status = newStatus;
        this.location = newLocation;
        System.out.println("\nТранспорт " + vehicleId + " изменил статус: " +
                           newStatus + ", местоположение: " + newLocation);
        notifyObservers();
    }

    @Override
    public void registerObserver(TransportObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TransportObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TransportObserver observer : observers) {
            observer.update(vehicleId, status, location);
        }
    }
}
