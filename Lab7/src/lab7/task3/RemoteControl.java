package lab7.task3;

import lab7.task3.commands.noCommand;
import lab7.task3.interfaces.Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[3];
        offCommands = new Command[3];
        Command noCommand = new noCommand();
        for(int i = 0; i < 3; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
     }

     public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
     }

     public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
     }
}
