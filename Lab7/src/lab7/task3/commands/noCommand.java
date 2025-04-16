package lab7.task3.commands;

import lab7.task3.interfaces.Command;

public class noCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Ничего не произошло");
    }
}
