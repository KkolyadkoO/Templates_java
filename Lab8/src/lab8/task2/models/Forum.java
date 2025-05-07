package lab8.task2.models;

import lab8.task2.interfaces.ForumMediator;

import java.util.ArrayList;
import java.util.List;

public class Forum implements ForumMediator {
    private List<User> users = new ArrayList<>();
    private List<Discussion> discussions = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println("Пользователь " + user.getName() + " присоединился к форуму");
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveNotification("Новое сообщение от " + sender.getName() + ": " + message);
            }
        }
    }

    @Override
    public void createDiscussion(String title, User creator) {
        Discussion discussion = new Discussion(title, creator);
        discussions.add(discussion);
        sendMessage("Создано новое обсуждение: " + title, creator);
    }

    @Override
    public void addCommentToDiscussion(String discussionTitle, Comment comment, User author) {
        for (Discussion discussion : discussions) {
            if (discussion.getTitle().equals(discussionTitle)) {
                discussion.addComment(comment);
                sendNotificationAboutComment(discussionTitle, author);
                return;
            }
        }
        System.out.println("Обсуждение '" + discussionTitle + "' не найдено");
    }

    private void sendNotificationAboutComment(String discussionTitle, User author) {
        for (User user : users) {
            if (user != author) {
                user.receiveNotification("Новый комментарий в обсуждении '" +
                                         discussionTitle + "' от " + author.getName());
            }
        }
    }
}
