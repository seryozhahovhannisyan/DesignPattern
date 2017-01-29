package seryozha.hovhannisyan.pattern.structural.proxy;

import java.io.IOException;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class PCommandExecutorImpl  implements PCommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
