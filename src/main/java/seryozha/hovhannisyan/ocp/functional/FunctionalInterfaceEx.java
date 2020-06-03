package seryozha.hovhannisyan.ocp.functional;


/**
 * Applying the @FunctionalInterface Annotation
 * <p>
 * While it is a good practice to mark a functional interface with the @FunctionalInterface
 * annotation for clarity, it is not required with functional programming. The Java compiler
 * implicitly assumes that any interface that contains exactly one abstract method is
 * a functional interface. Conversely, if a class marked with the @FunctionalInterface
 * annotation contains more than one abstract method, or no abstract methods at all, then
 * the compiler will detect this error and not compile.
 * One problem with not always marking your functional interfaces with this annotation is
 * that another developer may treat any interface you create that has only one method as
 * a functional interface. If you later modify the interface to have other abstract methods,
 * suddenly their code will break since it will no longer be a functional interface.
 * Therefore, it is recommend that you explicitly mark the interface with the
 *
 * @FunctionalInterface annotation so that other developers know which interfaces they
 * can safely apply lambdas to without the possibility that they may stop being functional
 * interfaces down the road.
 * The exam writers aren’t likely to use this annotation, as they expect you to be able to
 * determine whether an interface is a functional interface on your own.
 */
@FunctionalInterface
public interface FunctionalInterfaceEx extends AnInterfaceEmpty {
        //could not extend when has abstract methods
//        extends AnInterfaceOCA{

    public static final int MAX_SPEED = 100;
    public static final int MAX_SPEED2 = 100;

    public void sprint();

    //could not have second method
//    public abstract int getWingSpan2() throws Exception;

    //could not be only default, see java.util.function.Predicate
    public default void land() {
        System.out.println("Animal is landing");
    }


    // could not be implemented
//    public static double calculateSpeed(float distance, double time) {
//        return distance/time;
//    }

}
