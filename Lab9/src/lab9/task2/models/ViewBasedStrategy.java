package lab9.task2.models;

import lab9.task2.interfaces.DisplayStrategy;

public class ViewBasedStrategy implements DisplayStrategy {
    private int requiredViews;

    public ViewBasedStrategy(int requiredViews) {
        this.requiredViews = requiredViews;
    }

    @Override
    public void displayBanner() {
        System.out.printf("Показ баннера до достижения %d просмотров\n", requiredViews);
    }

    @Override
    public String getStrategyName() {
        return "Показ по просмотрам (" + requiredViews + " просмотров)";
    }
}
