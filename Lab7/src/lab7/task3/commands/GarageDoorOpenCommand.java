package lab7.task3.commands;

import lab7.task3.interfaces.Command;
import lab7.task3.objects.Garage;

public class GarageDoorOpenCommand implements Command {
    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.up();
    }
}
