package day56_Abstraction.ShapeTask;
/*ex1: Shapes task
    interface Volume:
            hasVolume = true;
            calculateVolume();
    abstract class Shape:
         calculateArea();
         calculatePerimeter();
*/
public abstract class Shape {
    public static String name;
    public double area;
    public double perimeter;
    public double volume;

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
