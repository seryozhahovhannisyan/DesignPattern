package seryozha.hovhannisyan.ocp.functional;


/**
 * The compiler automatically adds
 * public to all interface methods and abstract to all non‐static and non‐default
 * methods, if the developer does not provide them. By contrast, the class implementing the
 * interface must provide the proper modifiers.
 *
 *
 * Interfaces may also not be marked final or instantiated directly. There
 * are additional rules for default methods, such as Java failing to compile if a class or
 * interface inherits two default methods with the same signature and doesn’t provide its
 * own implementation.
 */
public interface AnInterfaceOCA {

    public int getWingSpan() throws Exception;
    public abstract int getWingSpan2() throws Exception;

    public static final int MAX_SPEED = 100;

    public default void land() {
        System.out.println("Animal is landing");
    }

    public static double calculateSpeed(float distance, double time) {
        return distance/time;
    }
}