package day56_Abstraction.ShapeTask;
/*
Square: extends Shape
         calculateArea(){ }
         calculatePerimeter(){ }
*/
public final class Square extends Shape{

    public double sides;


    public Square(double sides) {
        this.sides = sides;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.pow(sides,2);
    }

    @Override
    public double calculatePerimeter() {
        return sides* 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
