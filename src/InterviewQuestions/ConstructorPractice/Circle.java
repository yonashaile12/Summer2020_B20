package InterviewQuestions.ConstructorPractice;

public class Circle extends Shape{
    int radius;
    int diameter;

    public double calcArea(){

        return Math.pow(radius, 2) * Math.PI;

    }

    public Circle( int side, int length, int radius, int diameter) {
        super(side, length);
        this.radius = radius;
        this.diameter = diameter;
    }
}
