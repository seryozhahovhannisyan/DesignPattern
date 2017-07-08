package seryozha.hovhannisyan.pattern.behavioral.interpreter;

/**
 * Created by Serozh on 7/8/2017.
 */
public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int c){
        this.i=c;
    }

    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
}
