package seryozha.hovhannisyan.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by Seryozha on 1/28/2017.
 *
 * The problem with above serialized singleton class is that
 * whenever we deserialize it, it will create a new instance of the class.
 */
public class SingletonSerialized implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonSerialized(){}

    private static class SingletonHelper{
        private static final SingletonSerialized instance = new SingletonSerialized();
    }

    public static SingletonSerialized getInstance(){
        return SingletonHelper.instance;
    }

    /**
     * So it destroys the singleton pattern,
     * to overcome this scenario all
     * we need to do it provide the implementation of readResolve() method.
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }
}
