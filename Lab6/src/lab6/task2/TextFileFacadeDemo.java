package lab6.task2;

import java.io.IOException;

public class TextFileFacadeDemo {
    public static void main(String[] args) {
        TextFileFacade fileFacade = new TextFileFacade();
        String filePath = "example.txt";

        try {
            fileFacade.writeFile(filePath, "Привет, мир!\nЭто тестовая строка.");
            System.out.println("Файл успешно записан");

            String content = fileFacade.readFile(filePath);
            System.out.println("Содержимое файла:\n" + content);

            fileFacade.appendToFile(filePath, "Добавленная строка");
            System.out.println("Добавлена новая строка в файл");

            if (fileFacade.fileExists(filePath)) {
                System.out.println("Файл существует");
            }

            if (fileFacade.deleteFile(filePath)) {
                System.out.println("Файл успешно удален");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
