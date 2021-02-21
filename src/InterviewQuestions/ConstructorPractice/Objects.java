package InterviewQuestions.ConstructorPractice;

public class Objects {

    public static void main(String[] args) {

        Shape shape = new Circle(4, 6, 2, 5);
        System.out.println(shape);

        Circle circle = new Circle(3,5,2, 4);
        System.out.println(circle.calcArea());
       Square square = new Square(4,5);
        System.out.println(square.CalculatePerimeter());

        int num = 3;
        double num1 = num; // implicit casting

        double num2 = 2d;  // explicit casting
        int num3 = (int)num2;


        Integer in1 = 2;
        int num4 = in1; // auto boxing
        System.out.println(num4);

        int num5 = 4;
        Integer in2 = num5; // unboxing

        System.out.println(in2);



    }

    /**
     * double -->> float -->> int --->> short -->> byte
     * implicit casting -- is done automatically
     *  ex: int to double, byte to short,
     *
     * explicit casting -- have to be done manually
     *  ex: double to int, short to byte,
     *
     * auto boxing -- is done automatically by JVM
     * primitives to wrapper class objects
     * ex: int to Integer
     *
     * unboxing -- has to be done manually
     * wrapper class objects to primitive
     * ex: int to Integer
     *
     * upcasting -- is done automatically
     * super class to child to class object
     *
     * down casting -- has to be done manually
     * child class to super class object
     */
}
