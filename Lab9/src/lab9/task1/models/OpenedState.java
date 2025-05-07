package lab9.task1.models;

import lab9.task1.interfaces.FileState;

public class OpenedState implements FileState {
    @Override
    public void open(File file) {
        System.out.println("Файл уже открыт.");
    }

    @Override
    public void close(File file) {
        System.out.println("Закрываем файл...");
        file.setState(new ClosedState());
    }

    @Override
    public void lock(File file) {
        System.out.println("Блокируем файл...");
        file.setState(new LockedState());
    }

    @Override
    public void unlock(File file) {
        System.out.println("Файл не заблокирован.");
    }

    @Override
    public void printStatus() {
        System.out.println("Файл открыт.");
    }
}
