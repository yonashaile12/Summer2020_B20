package day46_ConstructorCalls;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        System.out.println(car1);
        System.out.println("==============================");

        Car car2 = new Car("Toyota", "RAV4");
        System.out.println(car2);
        System.out.println("===============================");

        Car car3 = new Car("BMW","X5", 2017);
        System.out.println(car3);
        System.out.println("================================");

        Car car4 = new Car("Honda","Civic",2019,25000);
        System.out.println(car4);
        System.out.println("================================");

        Car car5 = new Car("Toyota", "Camry",2016,22000,"Blue");
        System.out.println(car5);
        System.out.println("================================");
    }
}
