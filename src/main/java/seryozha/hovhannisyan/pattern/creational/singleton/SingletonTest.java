package seryozha.hovhannisyan.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class SingletonTest {
    public static void main(String[] args) {
        try {

            SingletonStaticBlockInitialization first = SingletonStaticBlockInitialization.getInstance();
            SingletonStaticBlockInitialization second = SingletonStaticBlockInitialization.getInstance();
            SingletonStaticBlockInitialization third = SingletonStaticBlockInitialization.getInstance();
            SingletonStaticBlockInitialization four = SingletonStaticBlockInitialization.getInstance();

            SingletonSerialized instanceOne = SingletonSerialized.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            //deserailize from file to object
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            SingletonSerialized instanceTwo = (SingletonSerialized) in.readObject();
            in.close();

            System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
            System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());




            Constructor[] constructors = SingletonStaticBlockInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                third = (SingletonStaticBlockInitialization) constructor.newInstance();
                break;
            }

            System.out.println("first " + first.hashCode());
            System.out.println("second " + second.hashCode());
            System.out.println("third " + third.hashCode());
            System.out.println("four " + four.hashCode());

        } catch (Exception re) {
            re.printStackTrace();
        }
        System.out.println("SingletonStaticBlockInitialization Created");
    }
}
