package day51_Exceptions;

class C{
    public C(int a){
        System.out.println("Super class' int arg constructor");
    }
}

public class SuperKeyWord3 extends C{ // sub class has to call a constructor from supper class

   public SuperKeyWord3(int a){
       super(100);
       System.out.println("Sub class' constructor with int arg");
   }


    public static void main(String[] args) {
        new SuperKeyWord3(100);
    }


    /*
    public void method(){
        super(300);
    }
     */
}
