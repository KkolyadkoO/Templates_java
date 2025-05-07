package lab8.task3;

import lab8.task3.models.Dispatcher;
import lab8.task3.models.Driver;
import lab8.task3.models.TransportVehicle;

public class Main {
    public static void main(String[] args) {
        TransportVehicle truck1 = new TransportVehicle("Грузовик-1");
        TransportVehicle bus1 = new TransportVehicle("Автобус-1");

        Dispatcher mainDispatcher = new Dispatcher("Иванов");
        Dispatcher backupDispatcher = new Dispatcher("Петров");

        Driver driver1 = new Driver("Сидоров", "Грузовик-1");
        Driver driver2 = new Driver("Кузнецов", "Автобус-1");

        truck1.registerObserver(mainDispatcher);
        truck1.registerObserver(driver1);

        bus1.registerObserver(mainDispatcher);
        bus1.registerObserver(driver2);

        truck1.updateStatus("Назначен рейс", "Терминал А");
        bus1.updateStatus("В пути", "Шоссе 45 км");

        System.out.println("\n=== Добавляем резервного диспетчера в подписчики ===");
        truck1.registerObserver(backupDispatcher);
        bus1.registerObserver(backupDispatcher);

        truck1.updateStatus("Задержка", "Трасса М-5, 120 км");
        bus1.updateStatus("Требуется заправка", "Заправка №3");

        System.out.println("\n=== Удаляем основного диспетчера из подписчиков ===");
        truck1.removeObserver(mainDispatcher);
        bus1.removeObserver(mainDispatcher);

        truck1.updateStatus("Авария", "Трасса М-5, 125 км");
        bus1.updateStatus("В гараже", "Гараж");
    }
}
