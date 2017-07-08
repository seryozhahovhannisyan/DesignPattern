package seryozha.hovhannisyan.pattern.behavioral.interpreter;

/**
 * Created by Serozh on 7/8/2017.
 */
public class IntToBinaryExpression implements Expression {

    private int i;

    public IntToBinaryExpression(int c){
        this.i=c;
    }
    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }
}
