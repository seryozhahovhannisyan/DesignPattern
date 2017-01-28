package seryozha.hovhannisyan.pattern.creational.singleton;

/**
 * Created by Seryozha on 1/28/2017.
 * <p>
 * The above implementation works fine incase of single threaded environment but
 * when it comes to multithreaded systems, it can cause issues if multiple
 * threads are inside the if loop at the same time.
 * It will destroy the singleton pattern and both threads will get the
 * different instances of singleton class.
 */
public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    /**
     * The easier way to create a thread-safe singleton class
     * is to make the global access method synchronized,
     * so that only one thread can execute this method at a time.
     * General implementation of this approach is like the below implementation.
     *
     * @return
     */
    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }

    /**
     * Above implementation works fine and provides thread-safety
     * but it reduces the performance because of cost associated with the synchronized method,
     * although we need it only for the first few threads who might create the separate instances (Read: Java Synchronization).
     * To avoid this extra overhead every time, double checked locking principle is used.
     * In this approach, the synchronized block is used inside the
     * if condition with an additional check to ensure that only one instance of singleton class is created.
     *
     * Below code snippet provides the double checked locking implementation.
     *
     * @return
     */
    public static SingletonThreadSafe getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

}
