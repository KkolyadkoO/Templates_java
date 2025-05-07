package lab8.task22.models;

import lab8.task22.interfaces.ForumComponent;
import lab8.task22.interfaces.ForumMediator;

import java.util.ArrayList;
import java.util.List;

public class Discussion extends ForumComponent {
    public String title;
    public List<Comment> comments = new ArrayList<Comment>();
    public Discussion(ForumMediator mediator, String title) {
        super(mediator);
        this.title = title;
        if(mediator.getClass() == Forum.class)
            ((Forum)mediator).addDiscussion(this);
        mediator.notify(this, "Появилась новая дискуссия " + title);
    }

    public void addComment(Comment comment){
        comments.add(comment);
        mediator.notify(this, "В дисскуссии "+ title + " новой комментарий \"" + comment.text+"\"");
    }

}
