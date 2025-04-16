package lab7.task3;

import lab7.task3.commands.*;
import lab7.task3.objects.Garage;
import lab7.task3.objects.Light;
import lab7.task3.objects.Stereo;

public class RemoteControlDemo {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Garage garage = new Garage();
        Stereo stereo = new Stereo();

        remoteControl.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remoteControl.setCommand(1, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
        remoteControl.setCommand(2, new GarageDoorOpenCommand(garage), new GarageDoorCloseCommand(garage));

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
    }
}
