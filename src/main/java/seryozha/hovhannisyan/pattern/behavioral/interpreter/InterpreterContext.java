package seryozha.hovhannisyan.pattern.behavioral.interpreter;

/**
 * Created by Serozh on 7/8/2017.
 */
public class InterpreterContext {
    public String getBinaryFormat(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i) {
        return Integer.toHexString(i);
    }
}
