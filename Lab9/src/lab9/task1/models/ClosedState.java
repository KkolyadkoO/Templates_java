package lab9.task1.models;

import lab9.task1.interfaces.FileState;

public class ClosedState implements FileState {
    @Override
    public void open(File file) {
        System.out.println("Открываем файл...");
        file.setState(new OpenedState());
    }

    @Override
    public void close(File file) {
        System.out.println("Файл уже закрыт.");
    }

    @Override
    public void lock(File file) {
        System.out.println("Закрытый файл нельзя заблокировать. Сначала откройте его.");
    }

    @Override
    public void unlock(File file) {
        System.out.println("Файл не заблокирован.");
    }

    @Override
    public void printStatus() {
        System.out.println("Файл закрыт.");
    }
}
