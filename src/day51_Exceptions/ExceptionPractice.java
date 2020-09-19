package day51_Exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {
        System.out.println("Hello");
/*
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){

        }

        System.out.println("World");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }
 */
        sleep(3);

        System.out.println("World");

        sleep(5);

        System.out.println("How are you?");


        }

    public static void sleep(int seconds){
       try {

           Thread.sleep(seconds * 1000);

       }catch (InterruptedException e){

       }
    }

}
