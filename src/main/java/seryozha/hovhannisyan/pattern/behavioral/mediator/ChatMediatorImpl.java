package seryozha.hovhannisyan.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seryozha on 1/30/2017.
 * <p>
 * Concrete Mediator
 * <p>
 * Now we will create concrete mediator class,
 * it will have a list of users in the group and provide logic for the communication between the users.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<MedUser> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(MedUser user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, MedUser user) {
        for (MedUser u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }

}
