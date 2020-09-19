package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3(){

    }

    public ConstructorCalls3(int a){
        this();
        System.out.println("Y");
    }

    public ConstructorCalls3(double a){
        //this();
        this(10); //one constructor can only call one constructor maximum
    }

    public void method1(){
        //ConstructorCalls3(); // cannot be called by name

        //this(); can only be used in a constructor

    }

}
