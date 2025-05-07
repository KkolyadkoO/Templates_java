package lab8.task22.interfaces;

public abstract class ForumComponent {
    protected ForumMediator mediator;

    public ForumComponent(ForumMediator mediator){
        this.mediator = mediator;
    }
}
