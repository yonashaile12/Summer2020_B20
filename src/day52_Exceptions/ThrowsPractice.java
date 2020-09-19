package day52_Exceptions;

public class ThrowsPractice {

    public static void main(String[] args) throws InterruptedException{
        m2();
        m1();
    }

    public static void m1()throws InterruptedException{
        Thread.sleep(3000);
    }

    public static void m2() throws InterruptedException{
        m1();
    }

    public static void m3(){

        try {
            m2();
        }catch (InterruptedException e){ }
    }

    public static void m4(){
        m3();
    }
}
