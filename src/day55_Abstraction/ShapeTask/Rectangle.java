package day55_Abstraction.ShapeTask;
/*
 3. create a sub class of shape called Rectangle
    attributes: width, length, name(static), area, perimeter,
    hasVolume(static),volume override the abstract methods

    add a constructor that takes two arguments for W & L of rectangle the
   and initialize the instance variables: width, length
   add a static block that can initialize the static variables of the rectangle
 */
public final class Rectangle extends Shape{

    public double length;
    public double width;

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2* (length + width);
    }

    public double calculateVolume(){
        return 0;
    }

    static {
        name = "Rectangle";
        hasVolume = false;
    }
                // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        // you don't need to use this keyword to initialize instance variables
        // because you don't have a local variable with the same name
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
