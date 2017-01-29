package seryozha.hovhannisyan.pattern.behavioral.mediator;

/**
 * Created by Seryozha on 1/30/2017.
 */
public class MedUserImpl extends MedUser {

    public MedUserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }
}
