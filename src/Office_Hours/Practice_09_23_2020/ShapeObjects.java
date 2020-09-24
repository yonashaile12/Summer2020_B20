package Office_Hours.Practice_09_23_2020;

public class ShapeObjects {

    public static void main(String[] args) {
        //Shape shape1 = new Shape(); you can not create an abstract object

        Square square1 = new Square(10);

        System.out.println(square1.calculateArea());
        System.out.println( square1.calculatePerimeter());
        System.out.println(square1.perimeter);
        System.out.println(square1.area);

        System.out.println(square1);
        System.out.println("====================================");






    }
}
