package lab6.task3;

import lab6.task3.factories.VehicleTypeFactory;
import lab6.task3.models.Vehicle;

public class FlyweightDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("А123БВ", "Иванов И.И.", 2020, "Седан", "Бензин"),
                new Vehicle("В456ГД", "Петров П.П.", 2019, "Внедорожник", "Дизель"),
                new Vehicle("Е789ЖЗ", "Сидоров С.С.", 2021, "Седан", "Бензин"),
                new Vehicle("И012КЛ", "Кузнецов К.К.", 2018, "Грузовик", "Дизель"),
                new Vehicle("М345НО", "Смирнов С.С.", 2022, "Седан", "Бензин")
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.display();
        }

        System.out.println("\nВсего создано типов транспорта: " +
                           VehicleTypeFactory.getTypesCount());
    }
}