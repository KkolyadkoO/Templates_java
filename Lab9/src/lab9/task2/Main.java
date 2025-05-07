package lab9.task2;

import lab9.task2.models.BannerManager;
import lab9.task2.models.ClickBasedStrategy;
import lab9.task2.models.TimeBasedStrategy;
import lab9.task2.models.ViewBasedStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BannerManager manager = new BannerManager(new TimeBasedStrategy(10));

        System.out.println("Управление рекламными баннерами. Доступные команды:");
        System.out.println("1 - Установить стратегию показа по времени (10 сек)");
        System.out.println("2 - Установить стратегию показа по кликам (5 кликов)");
        System.out.println("3 - Установить стратегию показа по просмотрам (1000 просмотров)");
        System.out.println("show - Показать баннер по текущей стратегии");
        System.out.println("status - Текущая стратегия показа");
        System.out.println("exit - Выход");

        while (true) {
            System.out.print("\nВведите команду: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "1":
                    manager.setStrategy(new TimeBasedStrategy(10));
                    System.out.println("Установлена стратегия показа по времени");
                    break;
                case "2":
                    manager.setStrategy(new ClickBasedStrategy(5));
                    System.out.println("Установлена стратегия показа по кликам");
                    break;
                case "3":
                    manager.setStrategy(new ViewBasedStrategy(1000));
                    System.out.println("Установлена стратегия показа по просмотрам");
                    break;
                case "show":
                    manager.display();
                    break;
                case "status":
                    System.out.println("Текущая стратегия: " + manager.getCurrentStrategyName());
                    break;
                case "exit":
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }
    }
}
