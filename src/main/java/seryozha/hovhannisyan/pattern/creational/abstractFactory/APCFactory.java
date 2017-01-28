package seryozha.hovhannisyan.pattern.creational.abstractFactory;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class APCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public APCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public AComputer createComputer() {
        return new APC(ram, hdd, cpu);
    }

}