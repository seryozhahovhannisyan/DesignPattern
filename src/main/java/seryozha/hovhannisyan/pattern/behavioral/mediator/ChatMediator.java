package seryozha.hovhannisyan.pattern.behavioral.mediator;

/**
 * Created by Seryozha on 1/30/2017.
 *
 * First of all we will create Mediator interface that will define the contract for concrete mediators.
 */
public interface ChatMediator {

    public void sendMessage(String msg, MedUser user);

    void addUser(MedUser user);
}
