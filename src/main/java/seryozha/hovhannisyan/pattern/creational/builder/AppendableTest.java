package seryozha.hovhannisyan.pattern.creational.builder;

import java.io.IOException;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class AppendableTest {
    public static void main(String[] args) throws IOException {
        Appendable aAppendable = new AppendableImpl("0123");
        aAppendable.append('5').append("678",1,3);
        System.out.println(aAppendable);


    }
}
