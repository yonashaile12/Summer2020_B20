package day46_ConstructorCalls;

public class ConstructorCalls4 {

    public ConstructorCalls4(){
        //this(); you can not call the constructor itself
    }

    public ConstructorCalls4(int a){
        this(2.5);
    }

    public ConstructorCalls4(double a){
        //this(10); constructor call can't call itself
        this();
    }
}
