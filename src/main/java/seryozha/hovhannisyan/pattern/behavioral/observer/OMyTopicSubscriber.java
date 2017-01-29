package seryozha.hovhannisyan.pattern.behavioral.observer;

/**
 * Created by Seryozha on 1/30/2017.
 */
public class OMyTopicSubscriber implements OObserver {

    private String name;
    private OSubject topic;

    public OMyTopicSubscriber(String nm) {
        this.name = nm;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + ":: No new message");
        } else
            System.out.println(name + ":: Consuming message::" + msg);
    }

    @Override
    public void setSubject(OSubject sub) {
        this.topic = sub;
    }
}
