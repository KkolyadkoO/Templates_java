package lab9.task1;

import lab9.task1.models.File;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File();

        System.out.println("Управление файлом. Доступные команды:");
        System.out.println("open - открыть файл");
        System.out.println("close - закрыть файл");
        System.out.println("lock - заблокировать файл");
        System.out.println("unlock - разблокировать файл");
        System.out.println("status - показать состояние файла");
        System.out.println("exit - выход");

        while (true) {
            System.out.print("\nВведите команду: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "open":
                    file.open();
                    break;
                case "close":
                    file.close();
                    break;
                case "lock":
                    file.lock();
                    break;
                case "unlock":
                    file.unlock();
                    break;
                case "status":
                    file.printStatus();
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
