package lab9.task3;

import lab9.task3.interfaces.Beverage;
import lab9.task3.models.Coffee;
import lab9.task3.models.Tea;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приготовление чая");
        Beverage tea = new Tea();
        tea.prepareBeverage();

        System.out.println("Приготовление кофе");
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
    }
}
