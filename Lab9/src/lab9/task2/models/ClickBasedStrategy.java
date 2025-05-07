package lab9.task2.models;

import lab9.task2.interfaces.DisplayStrategy;

public class ClickBasedStrategy implements DisplayStrategy {
    private int requiredClicks;

    public ClickBasedStrategy(int requiredClicks) {
        this.requiredClicks = requiredClicks;
    }

    @Override
    public void displayBanner() {
        System.out.printf("Показ баннера до достижения %d кликов\n", requiredClicks);
    }

    @Override
    public String getStrategyName() {
        return "Показ по кликам (" + requiredClicks + " кликов)";
    }
}
