package day60_Collection;

public class NullKeyWord {

    public static void main(String[] args) {
        String s1 = "Cybertek";

        System.out.println( s1.toUpperCase() );

        String s2 = null; // the default value of non-primitives
        //  it is not an instance of anything
        System.out.println( s2.toUpperCase() ); //NullPointerException
    }
}
