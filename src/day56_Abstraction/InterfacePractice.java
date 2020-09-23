package day56_Abstraction;

public interface InterfacePractice {
    // if it is class it is impossible to use instance in a static method

    int a = 200; // by default public and static

    public static void method1(){ // static method
        System.out.println(a); // static only accepts static
    }
        // interface is only meant to be inherited
     static void main(String[] args) {
        // there is no point to declare static method in interface

    } // main method

    default void method2(){

    } // default method

    //public void method3(){  you can not have a instance method

    //public interfacePractice(){ you can not have constructor in interface

    public abstract void method4(); // but interface was declared for pure abstract

    void method5(); // by default it is an abstract and abstract don't have a body
    // abstract keyword is mandatory to declare in the interface

    //static{} // you can not also have static block in interface
    //{} you can not have a instance block because you don't have instance variable




}
