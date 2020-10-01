package day59_OOPReview;


import day55_Abstraction.ShapeTask.*;
import day55_Abstraction.ShapeTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {

        // reference type decide what to implement
        Shape shape1 = new Circle(3);

        //System.out.println(shape1.r);
        System.out.println(   ((Circle)shape1).radius );
        //shape1.length;
        //ClassCastException Rectangle can't be referenced to Circle class
        //System.out.println( ((Rectangle)shape1).length );

        Rectangle r1 = new Rectangle(3,5);
        Shape shape2 = r1; //upcasting

        //Shape shape3 = (Circle)r1; there is no IS A relation between Circle and Rectangle


    }
}
