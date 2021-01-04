package bootCamp;

class Shape{
    public String name;

    protected double area(){
        return 0;
    }
}

class Rectangle extends Shape{
    public double length, width;
    @Override
    public double area(){
        return length * width;
    }
}

class Circle extends Shape{
    public double r;
    @Override
    public double area(){
        return r * r * Math.PI;
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
    }
}
