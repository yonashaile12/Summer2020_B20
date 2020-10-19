package day62_Maps;

public class String_VS_Builder_Buffer {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat("School"); //"Cybertek School

        System.out.println(str1); // "Cybertek" string is immutable

        System.out.println("=======================================");

        String str2 = new String("Cybertek");

        StringBuilder sb1 = new StringBuilder("Cybertek");
        sb1.append(" School");

        System.out.println(sb1); //"Cybertek School"StringBuilder it is muteable
        sb1.reverse(); //
        System.out.println(sb1); // loohcS ketrebyC

        System.out.println("=========================================");

        String name = "Level";
        String reversedName = new StringBuilder(name).reverse().toString(); //

        System.out.println(name.equalsIgnoreCase(reversedName));

        System.out.println("============================================");

        //converting string to StringBuilder
        String s1 = "Friday";
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s2.reverse());

        //Converting StringBuilder to String just use toString() method
        String s3 = s2.toString();

        System.out.println("==============================================");

        StringBuffer t1 = new StringBuffer();




    }

}
