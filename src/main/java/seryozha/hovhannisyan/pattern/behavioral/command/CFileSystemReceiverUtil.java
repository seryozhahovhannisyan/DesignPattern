package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public class CFileSystemReceiverUtil {

    public static CFileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new CWindowsFileSystemReceiver();
        } else{
            return new CUnixFileSystemReceiver();
        }
    }

}
