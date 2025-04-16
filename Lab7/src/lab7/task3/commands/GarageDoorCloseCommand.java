package lab7.task3.commands;

import lab7.task3.interfaces.Command;
import lab7.task3.objects.Garage;
import lab7.task3.objects.Stereo;

public class GarageDoorCloseCommand implements Command {
    Garage garage;

    public GarageDoorCloseCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.down();
    }
}
