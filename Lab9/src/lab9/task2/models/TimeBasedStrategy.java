package lab9.task2.models;

import lab9.task2.interfaces.DisplayStrategy;

public class TimeBasedStrategy implements DisplayStrategy {
    private int displayTime;

    public TimeBasedStrategy(int displayTime) {
        this.displayTime = displayTime;
    }

    @Override
    public void displayBanner() {
        System.out.printf("Показ баннера в течение %d секунд\n", displayTime);
    }

    @Override
    public String getStrategyName() {
        return "Показ по времени (" + displayTime + " сек)";
    }
}
