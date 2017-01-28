package seryozha.hovhannisyan.pattern.creational.builder;

import java.io.IOException;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class AppendableImpl implements Appendable {

    private String name;

    public AppendableImpl() {
        this.name = "";
    }

    public AppendableImpl(String name) {
        this.name = name;
    }

    @Override
    public Appendable append(CharSequence csq) throws IOException {
        this.name += csq;
        return this;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        this.name = this.name.substring(0, start) + csq + this.name.substring(end);
        return this;
    }

    @Override
    public Appendable append(char c) throws IOException {
        this.name += c;
        return this;
    }

    @Override
    public String toString() {
        return "AppendableImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
