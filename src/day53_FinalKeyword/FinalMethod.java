package day53_FinalKeyword;

 class A{ //  the class cannot have sub classes

    public A(){} // Constructor can't be final

    public final void method1(){
        System.out.println("Enter username and password");
    }
    private void method1(int a){

    }

    public final static void method2(int b){

    }

 }

public class FinalMethod extends A{
   /*
    @Override
    public void method1(){
        System.out.println("Enter something else");
    }
    */

    public final static void main(String[] args) {

    }

}
