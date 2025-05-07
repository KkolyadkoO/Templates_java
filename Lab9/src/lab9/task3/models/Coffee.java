package lab9.task3.models;

import lab9.task3.interfaces.Beverage;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Завариваем кофейные зерна");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавляем сахар и молоко");
    }
}
