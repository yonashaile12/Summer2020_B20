package day50_Inheritance_Overriding.ShapeTask;

public class Circle extends Shape{
/*
variable: area, perimeter
methods: calculateArea, calculatePerimeter
 */
    public double radius;
    public double diameter;
    public static double PI = 3.14;

   public Circle(double radius){
       this.radius = radius;
       diameter = radius * 2;
       area = calculateArea();
       perimeter = calculatePerimeter();
   }

    public double calculateArea(){
        return radius*radius*PI;
    }
    public double calculatePerimeter(){
        return diameter*PI;
    }


}
