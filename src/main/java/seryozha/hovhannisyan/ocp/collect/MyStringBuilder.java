package seryozha.hovhannisyan.ocp.collect;

public class MyStringBuilder {

    char  charSequence;
    public MyStringBuilder append(char s) {
        charSequence =  s;
        return this;
    }
}
