package lab6.task1;

import lab6.task1.components.BasicCarRental;
import lab6.task1.decorators.ChildSeatDecorator;
import lab6.task1.decorators.InsuranceDecorator;
import lab6.task1.decorators.NavigationDecorator;
import lab6.task1.interfaces.CarRental;

public class CarRentalDemo {
    public static void main(String[] args) {
    CarRental rental = new BasicCarRental("Toyota Camry", 50.0);
    System.out.println(rental.getDescription() + " - $" + rental.getCost());

    rental = new NavigationDecorator(rental, 10.0);
    System.out.println(rental.getDescription() + " - $" + rental.getCost());

    rental = new ChildSeatDecorator(rental, 5.0);
    System.out.println(rental.getDescription() + " - $" + rental.getCost());

    rental = new InsuranceDecorator(rental, 15.0);
    System.out.println(rental.getDescription() + " - $" + rental.getCost());

    CarRental fullRental = new InsuranceDecorator(
            new ChildSeatDecorator(
                    new NavigationDecorator(
                            new BasicCarRental("Honda Accord", 60.0), 10.0), 5.0), 15.0);
    System.out.println("\nПолный пакет:");
    System.out.println(fullRental.getDescription() + " - $" + fullRental.getCost());
}
}