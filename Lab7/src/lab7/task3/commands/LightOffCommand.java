package lab7.task3.commands;

import lab7.task3.interfaces.Command;
import lab7.task3.objects.Light;

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute(){
        light.off();
    }
}
