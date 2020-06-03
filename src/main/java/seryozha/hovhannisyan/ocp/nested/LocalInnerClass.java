package seryozha.hovhannisyan.ocp.nested;

public class LocalInnerClass {

    private int length = 5;

    public void calculate() {

//         int width = 20;
        //“effectively fi nal” concept was introduced.
        int height = 20;
        final int width = 20;

        /**
         * They do not have an access specifier.
         * They cannot be declared static and cannot declare static fields or methods.
         * They have access to all fields and methods of the enclosing class.
         * They do not have access to local variables of a method unless those variables are final
         * or effectively final. More on this shortly.
         */
        class Inner {
            public void multiply() {
                System.out.println(length * width * height);
            }
        }
//        width = 30;
        Inner inner = new Inner();

        inner.multiply();

    }
}
