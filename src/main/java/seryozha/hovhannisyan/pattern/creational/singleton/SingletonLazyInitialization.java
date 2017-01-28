package seryozha.hovhannisyan.pattern.creational.singleton;

/**
 * Created by Seryozha on 1/28/2017.
 *
 * Lazy initialization method to implement Singleton pattern creates
 * the instance in the global access method.
 * Here is the sample code for creating Singleton class with this approach.
 */
public class SingletonLazyInitialization {

    private static SingletonLazyInitialization instance;

    private SingletonLazyInitialization(){}

    public static SingletonLazyInitialization getInstance(){
        if(instance == null){
            instance = new SingletonLazyInitialization();
        }
        return instance;
    }

}


