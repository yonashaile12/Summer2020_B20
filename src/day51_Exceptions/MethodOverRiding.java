package day51_Exceptions;

class A{
    // static belongs to the class you can't override it
     protected  void method(){

    }

}

public class MethodOverRiding extends A{

    /*
    @Override
    public int method(){
        return 10;
    }
     */
    @Override // if it is this giving an error it mean that it is not over ridden method
    public void method(){

    }

    @Override
    public String toString(){
        return "example";
    }


}
