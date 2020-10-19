package day62_Maps;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;

public class GarbageCollectorReview {

    public static void main(String[] args) {

        String str1 = "Cybertek"; //eligible to Garbage collector
        str1 = null;
        System.out.println(str1);

        String s1 = new String("John");
        String s2 = new String("Aaron");

        s1=s2; // right after this s1 is eligible for Garbage collector
        System.out.println(s1+" : "+s2);

        System.out.println("=====================================");

        Circle c1 = new Circle(3);
        c1 = null;
        System.out.println(c1);

        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(2,5);
        r1 = r2; // the rectangle with length 10 and width 20 will be eligible for Grabage collector

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("========================================");

        String a1 = "Cybertek";
        a1 = null;
        System.out.println(a1); // "Cybertek" object does not have a reference

        String a2 = "MIT";
        String a3 = "Harvard";
        a2 = a3;//"MIT" is eligible for GC(garbage collector)
        System.out.println(a2);//Harvard
        System.out.println(a3);//Harvard

        System.out.println("==========================================");

        /*
        driver.close();
        driver = null;
         */
    }
}
