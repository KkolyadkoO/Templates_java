package lab8.task2.models;

import java.util.ArrayList;
import java.util.List;

public class Discussion {
    private String title;
    private User creator;
    private List<Comment> comments = new ArrayList<>();

    public Discussion(String title, User creator) {
        this.title = title;
        this.creator = creator;
    }

    public String getTitle() {
        return title;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<Comment> getComments() {
        return comments;
    }
}
