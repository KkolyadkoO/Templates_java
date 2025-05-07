package lab9.task1.models;

import lab9.task1.interfaces.FileState;

public class LockedState implements FileState {
    @Override
    public void open(File file) {
        System.out.println("Нельзя открыть заблокированный файл. Сначала разблокируйте его.");
    }

    @Override
    public void close(File file) {
        System.out.println("Нельзя закрыть заблокированный файл. Сначала разблокируйте его.");
    }

    @Override
    public void lock(File file) {
        System.out.println("Файл уже заблокирован.");
    }

    @Override
    public void unlock(File file) {
        System.out.println("Разблокируем файл...");
        file.setState(new OpenedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Файл заблокирован.");
    }
}
