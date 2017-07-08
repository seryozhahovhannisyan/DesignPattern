package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public interface CFileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
