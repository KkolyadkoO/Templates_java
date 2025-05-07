package lab8.task2.interfaces;

import lab8.task2.models.Comment;
import lab8.task2.models.User;

public interface ForumMediator {
    void addUser(User user);
    void sendMessage(String message, User sender);
    void createDiscussion(String title, User creator);
    void addCommentToDiscussion(String discussionTitle, Comment comment, User author);
}
