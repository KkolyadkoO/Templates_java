package lab8.task22.models;

import lab8.task22.interfaces.ForumComponent;
import lab8.task22.interfaces.ForumMediator;

import java.util.ArrayList;
import java.util.List;

public class Forum implements ForumMediator {

    private List<User> users = new ArrayList<User>();
    private List<Discussion> discussions = new ArrayList<Discussion>();



    @Override
    public void notify(ForumComponent forumComponent, String message) {
        if(forumComponent.getClass() == User.class)
        {
            for(User user : users){
                if(user != forumComponent){
                    System.out.println(user.name + " получил уведомление: "+message);
                }
            }
        } else if (forumComponent.getClass() == Discussion.class) {
            for(User user : users){
                System.out.println(user.name + " получил уведомление: "+message);
            }
        }
    }
    public void addUser(User user){
        users.add(user);
    }

    public void addDiscussion(Discussion discussion){
        discussions.add(discussion);
    }
}
