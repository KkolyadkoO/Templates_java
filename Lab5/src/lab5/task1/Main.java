package lab5.task1;

public class Main {
    public static void main(String[] args) {
        BeverageMachine machine = new BeverageMachine();

        Drink coffee = new Drink() {
            @Override
            public void sip() {
                System.out.println("Sipping coffee");
            }
        };
        machine.serveDrink(coffee);

        IceCream vanilla = new IceCream();
        Drink adaptedIceCream = new IceCreamToDrinkAdapter(vanilla);
        machine.serveDrink(adaptedIceCream);
    }
}
