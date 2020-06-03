package seryozha.hovhannisyan.ocp.nested;

/**
 * Behind the scenes, an enum is a type of class that mainly contains static members.
 *
 * Just because an enum can have lots of methods, doesn’t mean that it should. Try to keep
 * your enum s simple. If your enum is more than a page or two, it is way too long. Most enum s
 * are just a handful of lines. The main reason they get long is that when you start with a one‐
 * or two‐line method and then declare it for each of your dozen enum types, it grows long.
 * When they get too long or too complex, it makes the enum hard to read.
 */
public enum EnumSeason {

    //Class 'Anonymous class derived from EnumSeason' must implement abstract method 'printHours()' in 'EnumSeason'
    WINTER("Low") {
        public void printHours() {
            System. out .println("1" );
            nonAbstractPrintHours();
        }
        public void nonAbstractPrintHours() { System. out .println("nonAbstractPrintHours only from Winter abstract method");}
    },

    SPRING("Medium"){
        public void printHours() { System. out .println("2");}
    },

    SUMMER("High"){
        public void printHours() { System. out .println("3");}
    },

    FALL("Medium"){
        public void printHours() { System. out .println("4");}
    };

    private String expectedVisitors;

    private EnumSeason(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
        System. out .println("constructing" + this);
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }

    /**
     *What’s going on here? It looks like we created an abstract class and a bunch of tiny sub-
     * classes. In a way we did. The enum itself has an abstract method. This means that each and
     * every enum value is required to implement this method. If we forget one, we get a compiler error.
     * If we don’t want each and every enum value to have a method, we can create a default
     * implementation and override it only for the special cases:
     */
    public abstract void printHours();

    static void print() {
        for (EnumSeason season : EnumSeason.values()) {
            System.out.println(season.name() + " " + season.ordinal());
            season.printHours();

        }
    }

}
