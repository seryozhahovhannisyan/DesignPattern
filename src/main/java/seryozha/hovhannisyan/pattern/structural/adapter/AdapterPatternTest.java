package seryozha.hovhannisyan.pattern.structural.adapter;

/**
 * Created by Seryozha on 1/28/2017.
 */
public class AdapterPatternTest {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        ASocketAdapter sockAdapter = new ASocketObjectAdapterImpl();
        AVolt v3 = sockAdapter.get3Volt();// getVolt(sockAdapter, 3);
        AVolt v12 = getVolt(sockAdapter, 12);
        AVolt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        ASocketAdapter sockAdapter = new ASocketClassAdapterImpl();
        AVolt v3 = getVolt(sockAdapter, 3);
        AVolt v12 = getVolt(sockAdapter, 12);
        AVolt v120 = getVolt(sockAdapter, 120);
        System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
    }

    private static AVolt getVolt(ASocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 12:
                return sockAdapter.get12Volt();
            case 120:
                return sockAdapter.get120Volt();
            default:
                return sockAdapter.get120Volt();
        }
    }

}
