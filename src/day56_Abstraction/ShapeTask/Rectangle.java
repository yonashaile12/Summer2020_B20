package day56_Abstraction.ShapeTask;
/*
Rectangle: extends Shape
         calculateArea(){ }
         calculatePerimeter(){ }
 */
public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2* (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
