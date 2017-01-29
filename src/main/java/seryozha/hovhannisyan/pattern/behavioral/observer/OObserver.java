package seryozha.hovhannisyan.pattern.behavioral.observer;

/**
 * Created by Seryozha on 1/30/2017.
 *
 * Next we will create contract for Observer,
 * there will be a method to attach the Subject to the observer
 * and another method to be used by Subject to notify of any change.
 */
public interface OObserver {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(OSubject sub);

}
