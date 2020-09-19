package day51_Exceptions;

import java.util.ArrayList;

public class ExceptionsHandling {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // empty
        String exceptionMessage = "";
    try{

        System.out.println(list.get(1));

    }catch(IndexOutOfBoundsException e){
         exceptionMessage= e.getMessage();
    }
        //System.out.println(list.get(1)); // run time exceptions
        System.out.println("Next Step"); // you can't run the second print without fixing this exceptions
        System.out.println(exceptionMessage);
    }

}