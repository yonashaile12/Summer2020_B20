package day55_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(6);
        System.out.println(circle1.calculateArea());

        Rectangle rectangle = new Rectangle(7,6);
        System.out.println(rectangle.calculateArea());
        /*
        Cylinder cylinder = new Cylinder(8,4);
        System.out.println(cylinder.calculateArea());
         */

        System.out.println(circle1);
        System.out.println(rectangle);
       // System.out.println(cylinder);


        System.out.println("Circle has volume: "+ Circle.hasVolume);
        System.out.println("Rectangle has Volume: "+Rectangle.hasVolume);
    }
}
