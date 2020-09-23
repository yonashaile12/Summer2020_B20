package day56_Abstraction.ShapeTask;
/*
    Circle: extends Shape
         calculateArea();
         calculatePerimeter();
*/
public final class Circle extends Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {

        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
