package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public class CFileSystemClientTest {

    public static void main(String[] args) {
        //Creating the receiver object
        CFileSystemReceiver fs = CFileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        COpenFileCommand openFileCommand = new COpenFileCommand(fs);

        //Creating invoker and associating with Command
        CFileInvoker file = new CFileInvoker(openFileCommand);
        //perform action on invoker object
        file.execute();

        CWriteFileCommand writeFileCommand = new CWriteFileCommand(fs);
        file = new CFileInvoker(writeFileCommand);
        file.execute();

        CCloseFileCommand closeFileCommand = new CCloseFileCommand(fs);
        file = new CFileInvoker(closeFileCommand);
        file.execute();
    }

}
