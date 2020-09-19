package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

/*
4. create a sub class of shape called Cylinder
            attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
            add a static block that can initialize the static variables of the cylinder
 */
public final class Cylinder extends Shape{
    public double height;
    public double radius;


    public double calculateArea(){
        return (2*Math.PI*radius*height)+(2*Math.PI*Math.pow(radius,2));
    }

    public double calculatePerimeter(){
        return (2*Math.PI*Math.pow(radius,2)+(2*Math.PI*radius*height));
    }

    public double calculateVolume(){
        return Math.PI*Math.pow(radius,2)*height;
    }
    static {
        name = "Cylinder";
        hasVolume = true;
    }
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }
}
