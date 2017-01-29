package seryozha.hovhannisyan.pattern.behavioral.observer;

/**
 * Created by Seryozha on 1/30/2017.
 * Based on the requirements of Subject,
 * here is the base Subject interface that defines the contract methods to be implemented by any concrete subject.
 */
public interface OSubject {

    //methods to register and unregister observers
    public void register(OObserver obj);

    public void unregister(OObserver obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(OObserver obj);

}
