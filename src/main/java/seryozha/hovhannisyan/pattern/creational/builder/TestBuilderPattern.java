package seryozha.hovhannisyan.pattern.creational.builder;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class TestBuilderPattern {
    public static void main2(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        BComputer comp = new BComputer.ComputerBuilder( "500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

    }
}
