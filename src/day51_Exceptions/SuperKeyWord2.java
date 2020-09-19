package day51_Exceptions;

class B{
  public B(){
      System.out.println("Super class' Default constructor");
  }

 }
public class SuperKeyWord2 extends B{

    public SuperKeyWord2(){
        //super(); // implicitly call the super class' constructor
        System.out.println("Sub class' default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyWord2(); // this is how you call the constructor
    }
}
