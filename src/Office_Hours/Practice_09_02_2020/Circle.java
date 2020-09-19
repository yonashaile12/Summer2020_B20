package Office_Hours.Practice_09_02_2020;

public class Circle {

    public double radius;
    public double diameter;
    public static double PI ;  // global variable

    public double area;
    public double perimeter;


    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }


    private double calculateArea(){
        return radius*radius*PI;
    }
    // for INTERNAL use ONLY

    private double calculatePerimeter(){
        return diameter*PI;
    }
    // for INTERNAL use ONLY


    static{ // only runs one time, first to run
        PI = 3.14;
    }

    public String toString(){
        return "Radius: "+radius+", Diameter: "+
                diameter+", Area: "+area+", Perimeter: "+perimeter;
    }


}
