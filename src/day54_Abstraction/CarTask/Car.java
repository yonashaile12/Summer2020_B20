package day54_Abstraction.CarTask;
/*
Ex2:

    Car: abstract
        start();
    BMW
        start(): push start button
    Tesla
        start(): voice control
    Toyota
        start(): Insert the key
    Jeep
        start(): jump start

        1. abstract method: a method without implementation (does not have body)
           meant to be overRidden ( CANNOT BE final, static, private)
           Access-Modifier  abstract  Return_type   methodName(Parameter);
           (none private)    MUST      MUST
           public abstract double area();
 */
public abstract class Car { // Can not be final
        public Car(){}
    public abstract void start();


}

        //Car obj2 = new Car(); // not concrete class(cannot create object, object MUST be Concrete)
