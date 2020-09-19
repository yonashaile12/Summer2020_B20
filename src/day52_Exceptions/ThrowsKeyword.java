package day52_Exceptions;

import java.beans.IntrospectionException;

public class ThrowsKeyword {

    public static void main(String[] args) {
        //method1(); // exception was handled temporarily by throws
        method2();  // exceptions was permanently handled by try&catch
        //method3();

        //Thread.sleep(4000);
    }



    public static void method1() throws InterruptedException{ // Not permanent solution
        Thread.sleep(3000);
    }

    public static void method2(){
        try { //Permanent Solution
            Thread.sleep(3000);
        }catch(InterruptedException e){

        }


    }

    public static void method3()throws InterruptedException{
        method1();
    }
}
