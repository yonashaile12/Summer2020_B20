package day50_Inheritance_Overriding.ShapeTask;
/*
variable: area, perimeter
methods: calculateArea, calculatePerimeter
Area of the circle:    3.14 * radius * radius
Perimeter of circle:   3.14 * 2 * radius
 */
public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
        return width*length;
    }

    public double calculatePerimeter(){
        return (width * length) * 2;
    }

}
