package day54_Abstraction.CarTask;

public class ParkingLot {

    public static void main(String[] args) {
        //Car car1 = new Car();
        BMW car1=new BMW();
        Jeep car2=new Jeep();
        Toyota car3=new Toyota();
        Tesla car4= new Tesla();
        Car [] cars = { car1, car2, car3, car4 };
        for (Car each:cars){
            each.start();
        }




    }
}
