package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public class CWriteFileCommand implements CCommand {

    private CFileSystemReceiver fileSystem;

    public CWriteFileCommand(CFileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }
}
