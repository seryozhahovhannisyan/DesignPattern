package seryozha.hovhannisyan.pattern.structural.proxy;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class ProxyPatternTest {
    public static void main(String[] args){
        PCommandExecutor executor = new PCommandExecutorProxy("serozh", "1234567");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

         executor = new PCommandExecutorImpl();
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
