package day56_Abstraction;

public abstract class Abstract_VS_Interface {

    public int a;
    protected static int b;

    public void method1(){ }

    public static void method2(){ } // static method

    public abstract void method3(); // instance method

    public Abstract_VS_Interface(int a){ this.a = a; } // constructor

    static{ b = 300;} // static block

    { a = 3000; } // instance block

}

interface A{

    int a = 10;
    // the only variable you can have in interface is static final
    // static final is by default
    //public void method1(){ }
    public static void method2(){ } //you can have static method
    // public is given by default so no need to declare them
    //abstract method is always recommended in interface
    public abstract void method3(); // abstract method
                    void method3_2(int b);
   // by default public and abstract is declared

    public default void method4(){} //
// default method. you don't need to give public because by default it is public

    //public Abstract_VS_Interface(int a){ this.a = a; }
    // interface can not have constructor

    //static{ } interface can not have static block
    //{} interface can not have instance block

}
