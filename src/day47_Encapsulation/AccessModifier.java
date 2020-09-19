package day47_Encapsulation;

public class AccessModifier {
    // public
    public static int publicVariable = 100;


    public static void publicMethod(){
        System.out.println("public method");

    }
     static int defaultVariable = 200;

     static void defaultMethod(){
        System.out.println("default method");
    }

    //private no one can access it other than the people that have the access
    // Private: ONLY visible within the same class

    private static int privateVariable = 300;

     private static  void privateMethod(){
         System.out.println("private method");
     }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(publicVariable);

        publicMethod();
        defaultMethod();
        privateMethod();

    }

}

