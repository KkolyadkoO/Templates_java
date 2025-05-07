package lab8.task22;

import lab8.task22.models.Comment;
import lab8.task22.models.Discussion;
import lab8.task22.models.User;
import lab8.task22.models.Forum;

public class Main {
    public static void main(String[] args) {
        var mediator = new Forum();
        var user1 = new User(mediator, "Иван");
        var user2 = new User(mediator, "Мария");
        var user3 = new User(mediator, "Никита");
        var disc = new Discussion(mediator, "Дискуссия 1");
        disc.addComment(new Comment("Эта дискуссия просто топ"));
    }
}
