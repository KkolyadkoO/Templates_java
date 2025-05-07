package lab8.task1;

import lab8.task1.models.Library;
import lab8.task1.models.LibraryCard;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addCard(new LibraryCard("001", true, false, "Иванов Иван"));
        library.addCard(new LibraryCard("002", false, true, "Петров Петр"));
        library.addCard(new LibraryCard("003", true, true, "Сидорова Анна"));
        library.addCard(new LibraryCard("004", true, false, "Кузнецов Алексей"));
        library.addCard(new LibraryCard("005", true, true, "Смирнова Ольга"));

        System.out.println("Активные карточки:");
        Iterator<LibraryCard> activeIterator = library.getActiveCardsIterator();
        while (activeIterator.hasNext()) {
            System.out.println(activeIterator.next());
        }

        System.out.println("\nКарточки с просроченными книгами:");
        Iterator<LibraryCard> overdueIterator = library.getOverdueCardsIterator();
        while (overdueIterator.hasNext()) {
            System.out.println(overdueIterator.next());
        }
    }
}
