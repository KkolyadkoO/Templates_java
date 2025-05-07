package lab8.task2;

import lab8.task2.interfaces.ForumMediator;
import lab8.task2.models.Forum;
import lab8.task2.models.User;

public class Main {
    public static void main(String[] args) {
        ForumMediator forum = new Forum();

        User alice = new User("Алиса", forum);
        User bob = new User("Боб", forum);
        User charlie = new User("Чарли", forum);

        alice.sendMessageToAll("Привет всем! Как дела?");
        bob.createDiscussion("Паттерны проектирования");
        charlie.addComment("Паттерны проектирования", "Посредник - отличный паттерн!");
        alice.addComment("Паттерны проектирования", "Согласен, очень полезно!");
    }
}
