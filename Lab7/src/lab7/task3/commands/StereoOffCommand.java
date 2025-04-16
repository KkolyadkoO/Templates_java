package lab7.task3.commands;

import lab7.task3.interfaces.Command;
import lab7.task3.objects.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();

    }
}
