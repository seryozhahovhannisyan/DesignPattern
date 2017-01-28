package seryozha.hovhannisyan.pattern.creational.factory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class FServer extends FComputer {

    private String ram;
    private String hdd;
    private String cpu;

    public FServer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
