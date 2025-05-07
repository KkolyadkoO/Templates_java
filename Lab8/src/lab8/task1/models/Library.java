package lab8.task1.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<LibraryCard> cards = new ArrayList<>();

    public void addCard(LibraryCard card) {
        cards.add(card);
    }

    public Iterator<LibraryCard> getActiveCardsIterator() {
        return new ActiveCardsIterator();
    }

    public Iterator<LibraryCard> getOverdueCardsIterator() {
        return new OverdueCardsIterator();
    }

    private class ActiveCardsIterator implements Iterator<LibraryCard> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            while (currentIndex < cards.size()) {
                if (cards.get(currentIndex).isActive()) {
                    return true;
                }
                currentIndex++;
            }
            return false;
        }

        @Override
        public LibraryCard next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return cards.get(currentIndex++);
        }
    }

    private class OverdueCardsIterator implements Iterator<LibraryCard> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            while (currentIndex < cards.size()) {
                LibraryCard card = cards.get(currentIndex);
                if (card.hasOverdueBooks() && card.isActive()) {
                    return true;
                }
                currentIndex++;
            }
            return false;
        }

        @Override
        public LibraryCard next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return cards.get(currentIndex++);
        }
    }
}
