package seryozha.hovhannisyan.ocp.functional;

public class AnInterfaceOCAImpl implements AnInterfaceOCA {

    @Override
    public int getWingSpan() {
        return 15;
    }

    @Override
    public int getWingSpan2() throws Exception {
        return 0;
    }

    @Override
    public void land() {
        System.out.println("Eagle is diving fast");
    }



//    public static double calculateSpeed(float distance, double time) {
//        return super.calculateSpeed();
//    }
}