package day51_Exceptions;

class X{
    public X(){
        System.out.println("X");
    }
}

class Y extends X{
    //super() implicitly calls super // X Y
    public Y(){
        System.out.println("Y");
    }
}
class Z extends Y{
    public Z(){
        // super() implicitly calls super class // X Y Z
        System.out.println("Z");
    }
}


public class Practice {

    public static void main(String[] args) {

        new Z();
    }
}
