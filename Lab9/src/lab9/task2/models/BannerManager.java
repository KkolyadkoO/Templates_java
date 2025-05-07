package lab9.task2.models;

import lab9.task2.interfaces.DisplayStrategy;

public class BannerManager {
    private DisplayStrategy strategy;

    public BannerManager(DisplayStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DisplayStrategy strategy) {
        this.strategy = strategy;
    }

    public void display() {
        strategy.displayBanner();
    }

    public String getCurrentStrategyName() {
        return strategy.getStrategyName();
    }
}
