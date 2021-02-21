package InterviewQuestions.ConstructorPractice;

public class Shape {
    int side;
    int length;

    public Shape(int side, int perimeter){
        this.side = side;
        this.length = perimeter;
    }

    public String toString(){
        return "Side: " + side +"\n Length: "+ length;
    }

}
