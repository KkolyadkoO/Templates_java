package lab6.task1.decorators;

import lab6.task1.interfaces.CarRental;

public class RentalDecorator implements CarRental {
    protected CarRental decoratedRental;

    public RentalDecorator(CarRental decoratedRental) {
        this.decoratedRental = decoratedRental;
    }

    @Override
    public String getDescription() {
        return decoratedRental.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedRental.getCost();
    }
}
