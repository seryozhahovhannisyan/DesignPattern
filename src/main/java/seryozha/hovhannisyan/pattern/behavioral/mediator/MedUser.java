package seryozha.hovhannisyan.pattern.behavioral.mediator;

/**
 * Created by Seryozha on 1/30/2017.
 * <p>
 * Mediator Pattern Colleague Interface
 * <p>
 * Users can send and receive messages, so we can have User interface or abstract class.
 * I am creating User as abstract class like below.
 */
public abstract class MedUser {

    //Notice that User has a reference to the mediator object, it’s required for the communication between different users.
    protected ChatMediator mediator;
    protected String name;

    public MedUser(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

}
