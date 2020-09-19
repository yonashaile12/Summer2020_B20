package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println( "The area of the circle is: "+circle.calculateArea() );
        System.out.println( "The perimeter of the circle is: "+circle.calculatePerimeter() );
        System.out.println("=============================================");

        
        Rectangle rectangle = new Rectangle(5,7);
        System.out.println("The area of the rectangle is: "+rectangle.calculateArea() );
        System.out.println("The perimeter of the rectangle is: "+ rectangle.calculatePerimeter() );
        System.out.println("==============================================");


        Square square = new Square(4);
        System.out.println("The area of the square is: "+square.calculateArea() );
        System.out.println("The perimeter of the square is: "+square.calculatePerimeter() );
    }
}
