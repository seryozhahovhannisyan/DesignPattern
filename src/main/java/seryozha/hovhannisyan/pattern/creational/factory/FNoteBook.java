package seryozha.hovhannisyan.pattern.creational.factory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class FNoteBook extends FComputer {

    private String ram;
    private String cpu;

    public FNoteBook(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return null;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
