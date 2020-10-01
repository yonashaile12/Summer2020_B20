package day59_OOPReview;

interface X{
    //can't be final
    public abstract void method1();
    // the only access modifier that is allowed in abstract class is public
    void method2();
    //default method can be implemented in interface class
    // variables and method are by default they are public static final
    int a = 100; // this is not an instance variable it is static variable
    static int b = 200;
    // by default all the variables are final so you have to declare them right away
    //static{ } static block is not allowed because by default every method is public static final

}

abstract class Y{
    // can't be final
    int a = 100;
    static int b = 200;

    public abstract void method1();
}

public class Abstraction {

    public static void main(String[] args) {

        /*
        Y obj = new Y();
        X obj = new X();
         */
    }
}
