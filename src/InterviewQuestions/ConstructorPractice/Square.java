package InterviewQuestions.ConstructorPractice;

public class Square extends Shape{

    public Square(int side, int length) {
        super(side, length);
    }

    public double CalculatePerimeter(){
        return Math.pow(side, 4);
    }


}
