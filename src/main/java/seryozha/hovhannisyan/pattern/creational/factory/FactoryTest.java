package seryozha.hovhannisyan.pattern.creational.factory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class FactoryTest {
    public static void main(String[] args) {
        FComputer pc = FComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        FComputer server = FComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
        FComputer noteBook =  FComputerFactory.getComputer("NoteBook", "16 GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::      " + pc);
        System.out.println("Factory Server Config::  " + server);
        System.out.println("Factory NoteBook Config::" + noteBook);
    }
}
