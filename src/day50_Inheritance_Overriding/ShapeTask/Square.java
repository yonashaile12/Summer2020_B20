package day50_Inheritance_Overriding.ShapeTask;
/*
Area of the rectangle:  width * length
Perimeter of rectangle: (width + length) * 2
variable: area, perimeter
methods: calculateArea, calculatePerimeter
 */
public class Square extends Shape{

    public double side;

    public Square(double side){
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return side * side;
    }

    public double calculatePerimeter(){
        return side* side * side * side;
    }
}
