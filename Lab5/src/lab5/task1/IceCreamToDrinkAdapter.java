package lab5.task1;

public class IceCreamToDrinkAdapter implements Drink{
    private IceCream iceCream;

    public IceCreamToDrinkAdapter(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void sip() {
        iceCream.eat();
    }
}
