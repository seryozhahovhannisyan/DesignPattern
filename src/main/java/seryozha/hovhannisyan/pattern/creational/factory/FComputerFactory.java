package seryozha.hovhannisyan.pattern.creational.factory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class FComputerFactory {

    public static FComputer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new FPC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new FServer(ram, hdd, cpu);
        else if ("NoteBook".equalsIgnoreCase(type)) return new FNoteBook(ram, cpu);

        return null;
    }

}
