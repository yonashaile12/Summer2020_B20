package day51_Exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) {

        int [] arr = {1,2,3};

        System.out.println("Test started");
        //System.out.println(arr[100]); // uncheck exceptions (unexpected event)

        //Thread.sleep(3000); // checked exceptions (unwanted event)
        // checked exceptions occurred during compiling
        String str = "Cybertek";
       // System.out.println(str.charAt(-1));
       // unchecked it occurred during run time
       // System.out.println("step2");

    }
}
