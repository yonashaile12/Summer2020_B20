package day51_Exceptions;

public class ExceptionHandling2 {

    public static void main(String[] args) {
        String exceptionMessage = "";
        //System.out.println(10/0);
        try{
            System.out.println(10/0);

        }catch(ArithmeticException e){

            exceptionMessage = e.getMessage();
        }

        System.out.println("Next Step");
        System.out.println(exceptionMessage);

    }
}
