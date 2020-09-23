package day56_Abstraction.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        circle1.calculateArea();
        circle1.calculatePerimeter();

        System.out.println(circle1);

        Square square1 = new Square(4);
        square1.calculateArea();
        square1.calculatePerimeter();
        System.out.println(square1);

    }
}
