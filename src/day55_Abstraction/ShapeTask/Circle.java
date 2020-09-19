package day55_Abstraction.ShapeTask;
/*
2. create a sbub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the column)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle

 */
public final class Circle extends Shape{

    public double radius;

    /*
    6 variables :
                2 statics: name, hasVolume
                4 instance: radius, area, perimeter,volume
     */

    public Circle(double radius){
        this.radius = radius;
        area  = calculateArea();
        // you don't need to use this keyword to initialize instance variables
        // because you don't have a local variable with the same name
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }


    public double calculateArea(){
       return Math.pow(radius, 2) * Math.PI;
     }

     public double calculatePerimeter(){
        return radius*2*Math.PI;
     }

     public double calculateVolume(){
        return 0;
     }

     static{
        name = "Circle";
        hasVolume = false;
     }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
