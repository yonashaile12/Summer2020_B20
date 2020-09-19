package day53_FinalKeyword;

import java.time.LocalDate;

public class FinalVariable {
    final static String eyeColor = "Brown";
    final String bloodType = "A";

    final int x;
    final static int y;
    //if they are final instance variable they need to be initialized right away
    // if you don't want to declare them right away you have to declare them
    // in a constructor or static block

    static{
        y = 300;
    }
    public FinalVariable(){
        x = 700;
    }


    public static void main(String[] args) {

        LocalDate dateOfBirth = LocalDate.of(2000,5,7);
        //dateOfBirth = LocalDate.of(1990,6,5);

        System.out.println(dateOfBirth);

        final long ssn = 1234567;
        System.out.println(ssn);

        final double PI = 3.14;
        //PI = 2.14;

        System.out.println(PI);

       final char gender = 'M';

        System.out.println(gender);

        final String birthPlace = "USA";

        System.out.println(birthPlace);

    }
}
