package seryozha.hovhannisyan.pattern.creational.abstractFactory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class AServer extends AComputer {

    private String ram;
    private String hdd;
    private String cpu;

    public AServer(String ram, String hdd, String cpu) {
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