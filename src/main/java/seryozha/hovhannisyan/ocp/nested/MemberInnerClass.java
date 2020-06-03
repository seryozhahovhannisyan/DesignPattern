package seryozha.hovhannisyan.ocp.nested;


/*
A member inner class declaration looks just like a stand‐alone class declaration except
that it happens to be located inside another class—oh, and that it can use the instance vari-
ables declared in the outer class.
 */
public class MemberInnerClass {

    private String greeting = "Hi";

    /**
     * Compiling the Outer.java class with which we have been working creates two class
     * files. Outer.class you should be expecting. For the inner class, the compiler creates
     * Outer$Inner.class . You don’t need to know this syntax for the exam. We mention it so
     * that you aren’t surprised to see files with $ appearing in your directories. You do need to
     * understand that multiple class files are created.
     */
    protected class Inner implements AnInterface{
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }



}