package day45_Constructor;

public class Sum {

    public Sum(int a, int b){
        System.out.println(a+" + "+b +" = "+ (a+b));
    }

    public Sum(double a, double b){
        System.out.println(a+" + "+b+" = "+ (a+b));
    }

    public Sum(int a, int b, int c){
        System.out.println(a+" + "+b+" + "+c+" = "+ (a+b+c));
    }

    public Sum(double a, double b, double c){
        System.out.println(a+" + "+b+" + "+c+" = "+ (a+b+c));
    }

    public static void main(String[] args) {
        Sum obj1 = new Sum(2,3);
        Sum obj2 = new Sum(3.5,4.3);
        Sum obj3 = new Sum(4,7,6);
        Sum obj4 = new Sum(3.4,4.5,6.7);
    }
}
