package lab7.task3.commands;

import lab7.task3.interfaces.Command;
import lab7.task3.objects.Light;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.on();
    }
}
