package seryozha.hovhannisyan.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Seryozha on 1/30/2017.
 * <p>
 * The method implementation to register and unregister an observer is very simple,
 * the extra method is postMessage() that will be used by client application to post String message to the topic.
 * Notice the boolean variable to keep track of the change in the state of topic and used in notifying observers.
 * This variable is required so that if there is no update and somebody calls notifyObservers() method,
 * it doesn’t send false notifications to the observers.
 * <p>
 * Also notice the use of synchronization in notifyObservers() method to make sure the notification is sent
 * only to the observers registered before the message is published to the topic.
 * <p>
 * Here is the implementation of Observers that will watch over the subject.
 */
public class OMyTopic implements OSubject {

    private List<OObserver> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public OMyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(OObserver obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(OObserver obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<OObserver> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (OObserver obj : observersLocal) {
            obj.update();
        }

    }

    @Override
    public Object getUpdate(OObserver obj) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
