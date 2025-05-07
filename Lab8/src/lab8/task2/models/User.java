package lab8.task2.models;

import lab8.task2.interfaces.ForumMediator;

public class User {
    private String name;
    private ForumMediator mediator;

    public User(String name, ForumMediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessageToAll(String message) {
        mediator.sendMessage(message, this);
    }

    public void createDiscussion(String title) {
        mediator.createDiscussion(title, this);
    }

    public void addComment(String discussionTitle, String commentText) {
        Comment comment = new Comment(commentText, this);
        mediator.addCommentToDiscussion(discussionTitle, comment, this);
    }

    public void receiveNotification(String notification) {
        System.out.println(name + " получил уведомление: " + notification);
    }
}
