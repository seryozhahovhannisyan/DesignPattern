package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public class CCloseFileCommand implements CCommand {

    private CFileSystemReceiver fileSystem;

    public CCloseFileCommand(CFileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}
