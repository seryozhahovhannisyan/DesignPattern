package seryozha.hovhannisyan.pattern.behavioral.command;

/**
 * Created by Serozh on 6/7/2017.
 */
public class CFileInvoker {
    public CCommand command;

    public CFileInvoker(CCommand c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}
