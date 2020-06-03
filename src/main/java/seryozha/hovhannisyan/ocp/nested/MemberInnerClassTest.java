package seryozha.hovhannisyan.ocp.nested;

public class MemberInnerClassTest {


    public static void main(String[] args) {
        MemberInnerClass outer = new MemberInnerClass();
        outer.callInner();

        // Since a member inner class is not static, it has to be used with an instance of the outer
        //class. Line 13 shows that an instance of the outer class can instantiate Inner normally. This
        //works because callInner() is an instance method on Outer . Both Inner and callInner()
        //are members of Outer . Since they are peers, they just write the name.
        MemberInnerClass.Inner inner = outer.new Inner();



    }

}
