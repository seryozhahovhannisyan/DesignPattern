package seryozha.hovhannisyan.pattern.structural.proxy;

/**
 * Created by Seryozha on 1/29/2017.
 * <p>
 * Now we want to provide only admin users to have full access of above class,
 * if the user is not admin then only limited commands will be allowed.
 * Here is our very simple proxy class implementation.
 */
public class PCommandExecutorProxy implements PCommandExecutor {

    private boolean isAdmin;
    private PCommandExecutor executor;

    public PCommandExecutorProxy(String user, String pwd) {
        if ("serozh".equals(user) && "12456".equals(pwd)) isAdmin = true;
        executor = new PCommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
