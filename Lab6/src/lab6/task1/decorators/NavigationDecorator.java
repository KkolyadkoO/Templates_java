package lab6.task1.decorators;

import lab6.task1.interfaces.CarRental;

public class NavigationDecorator extends RentalDecorator {
    private double navigationPrice;

    public NavigationDecorator(CarRental decoratedRental, double navigationPrice) {
        super(decoratedRental);
        this.navigationPrice = navigationPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", навигационная система";
    }

    @Override
    public double getCost() {
        return super.getCost() + navigationPrice;
    }
}