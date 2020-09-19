package Office_Hours.Practice_09_15_2020;


class data{


    public void methodA(){
        System.out.println("method A");
    }
}


public class Test extends data{

    public void methodB(){

    }

    public static void main(String[] args) {
        data obj = new data();
        obj.methodA();
    }
}
