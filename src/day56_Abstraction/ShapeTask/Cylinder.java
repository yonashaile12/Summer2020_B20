package day56_Abstraction.ShapeTask;
/*
Cylinder: extends Shape implements Volume
         calculateArea(){}
         calculatePerimeter(){}
         calculateVolume(){}
*/
public class Cylinder extends Shape implements Volume{

    public double height;
    public double radius;

    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2*Math.PI*Math.pow(radius,2)+(2*Math.PI*radius*height));
    }

    @Override
    public double calculateVolume() {
        return Math.PI*Math.pow(radius,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
