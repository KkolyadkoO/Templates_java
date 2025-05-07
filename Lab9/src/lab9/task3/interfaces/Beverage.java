package lab9.task3.interfaces;

public abstract class Beverage {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        System.out.println("Напиток готов!\n");
    }

    private void boilWater() {
        System.out.println("Кипятим воду");
    }

    private void pourInCup() {
        System.out.println("Наливаем в чашку");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}