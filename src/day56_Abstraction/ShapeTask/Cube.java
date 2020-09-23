package day56_Abstraction.ShapeTask;
/*
Cube: extends Shape implements Volume
         calculateArea(){}
         calculatePerimeter(){}
         calculateVolume(){}
*/
public class Cube extends Shape implements Volume{

    public double sides;

    public Cube(double sides) {
        this.sides = sides;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(sides, 2) *6;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    //6a2
    @Override
    public double calculateVolume() {
        return Math.pow(sides, 3);

    }

    @Override
    public String toString() {
        return "Cube{" +
                "sides=" + sides +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
