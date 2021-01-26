package bootCamp;

interface Volume{

     int a = 100; // variables are public static final in interface
    // you can't have static block instance variable, constructors
    double volume();
}

abstract class Shape{
    public String name;

    protected abstract double area();


}

class Rectangle extends Shape{
    public double length, width;

    public double area(){
        return length * width;
    }


}

class Circle extends Shape{
    public double r;

    public double area(){
        return r * r * Math.PI;
    }



}

final class Cube implements Volume{


    protected double area() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 5;
        System.out.println(c1.area());

        Rectangle rectangle = new Rectangle();
        rectangle.length = 4;
        rectangle.width = 3;
        System.out.println(rectangle.area());

        System.out.println(Volume.a);
    }
}
