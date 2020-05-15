package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public class CWindowsFileSystemReceiver implements CFileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }
}
