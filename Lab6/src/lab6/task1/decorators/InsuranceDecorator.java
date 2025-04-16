package lab6.task1.decorators;

import lab6.task1.interfaces.CarRental;

public class InsuranceDecorator extends RentalDecorator {
    private double insurancePrice;

    public InsuranceDecorator(CarRental decoratedRental, double insurancePrice) {
        super(decoratedRental);
        this.insurancePrice = insurancePrice;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", страховка";
    }

    @Override
    public double getCost() {
        return super.getCost() + insurancePrice;
    }
}