package lab8.task22.models;

import lab8.task22.interfaces.ForumComponent;
import lab8.task22.interfaces.ForumMediator;

public class User extends ForumComponent {
    public String name;
    public User(ForumMediator mediator, String name) {
        super(mediator);
        this.name = name;
        if(mediator.getClass() == Forum.class)
            ((Forum)mediator).addUser(this);
        mediator.notify(this, "Появился новый участник "+ this.name);
    }

    public void sendMessage(String message){
        mediator.notify(this, message);
    }

}
