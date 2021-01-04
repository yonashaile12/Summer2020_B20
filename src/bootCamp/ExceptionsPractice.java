package bootCamp;

import java.io.IOException;
import java.util.NoSuchElementException;

public class ExceptionsPractice {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(2000);
        //throws only handles checked exceptions

        try {
            throw new NoSuchElementException();
        }catch (RuntimeException e){
 // IndexOutOfBoundsException or any exception that does not have parent child relationship
 // IndexOutOfBoundsException can not handle this exception
            System.out.println("Catch block");
        //    System.exit(0);
        }finally {
            System.out.println("Finally Block");
        }


        System.out.println("Hello Batch 20");

        method2();
    }

    public static void method1() throws IOException {

        throw new IOException();
    }

    public static void method2() {
        try {
            method1();
        }catch (IOException e){

        }
    }
}
