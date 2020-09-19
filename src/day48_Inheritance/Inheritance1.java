package day48_Inheritance;
class A{
    static int a = 10;
    // A is a parent so it will not inherit from anything from his child
    // the super class cannot extend its sub class
}
class B extends A{
    static int b = 20;
    // 2 Variables: inherited from class A(a), b
}
class C extends B{
    static int c = 30;
    // 3 Variables: inherited from class A(a), & from class B(b), c
}
public class Inheritance1 {
}
