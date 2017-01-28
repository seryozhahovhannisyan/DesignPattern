package seryozha.hovhannisyan.pattern.creational.singleton;

/**
 * Created by Seryozha on 1/28/2017.
 *
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a singleton class but it has a drawback
 * that instance is created even though client application might not be using it.
 */
public class SingletonEagerInitialization {

    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

    //private constructor to avoid client applications to use constructor
    private SingletonEagerInitialization(){}

    public static SingletonEagerInitialization getInstance(){
        return instance;
    }

}
