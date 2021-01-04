package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {


        System.out.println( AccessModifier.publicVariable );
        AccessModifier.publicMethod();

        System.out.println( AccessModifier.defaultVariable );

        AccessModifier.defaultMethod();

        //System.out.println(AccessModifier.privateVariable);
        // the reason privateVariable or privateMethod is not compiling is private is not visible outside its class
        //AccessModifier.privateMethod();

//        Encapsulation obj1 = new Encapsulation();
//       // System.out.println(obj1.ssn);
//     // you can't directly get access because of a private keyword
//
//        System.out.println(obj1.getSsn());
//        obj1.setSsn(345678912);
//        System.out.println(obj1.getSsn());








    }
}
