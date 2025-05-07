package lab9.task3.models;

import lab9.task3.interfaces.Beverage;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Завариваем чайные листья");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавляем лимон");
    }

}
