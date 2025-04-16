package lab6.task1.decorators;

import lab6.task1.interfaces.CarRental;

public class ChildSeatDecorator extends RentalDecorator {
    private double childSeatPrice;

    public ChildSeatDecorator(CarRental decoratedRental, double childSeatPrice) {
        super(decoratedRental);
        this.childSeatPrice = childSeatPrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", детское кресло";
    }

    @Override
    public double getCost() {
        return super.getCost() + childSeatPrice;
    }
}
