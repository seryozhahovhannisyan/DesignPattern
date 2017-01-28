package seryozha.hovhannisyan.pattern.creational.singleton;

/**
 * Created by Seryozha on 1/28/2017.
 *
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option for exception handling.
 */
public class SingletonStaticBlockInitialization {

    private static SingletonStaticBlockInitialization instance;

    private SingletonStaticBlockInitialization(){
       // Integer i = Integer.parseInt("aa");
    }

    //static block initialization for exception handling
    static{
        try{
            instance = new SingletonStaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static SingletonStaticBlockInitialization getInstance(){
        return instance;
    }

}
