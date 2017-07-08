package seryozha.hovhannisyan.pattern.behavioral.observer;

/**
 * Created by Seryozha on 1/30/2017.
 */
public class ObserverPatternTest {
    public static void main2(String[] args) {
        //create subject
        OMyTopic topic = new OMyTopic();

        //create observers
        OObserver obj1 = new OMyTopicSubscriber("Obj1");
        OObserver obj2 = new OMyTopicSubscriber("Obj2");
        OObserver obj3 = new OMyTopicSubscriber("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");
    }
}
