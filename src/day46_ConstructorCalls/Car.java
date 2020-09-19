package day46_ConstructorCalls;
/*
2. class name: Car
            instance variables:
                    brand, model, year, price, color
            1st constructor: initialize the brand of the car
            2nd constructor: initialize the brand and model of the car
                            (MUST apply constructor Call)
            3rd constructor: initialize the brand, model, year of the car
                            (MUST apply constructor Call)
            4th constructor: initialize the brand, model, year, pric of the car
                            (MUST apply constructor Call)
            5th Constructor: initialize all isntances of the car
                            (MUST apply constructor Call)
            Instance methods:
                toString()
* */
public class Car {

    String brand;
    String model;
    int year;
    double price;
    String color;

    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand, String model){
        this(brand);
        this.model = model;
    }
    public Car(String brand, String model, int year ){
        this(brand, model);
        this.year = year;
    }
    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price = price;
    }
    public Car(String brand, String model, int year, double price, String color){
        this(brand, model, year,price);
        this.color = color;
    }

    public String toString(){
        return "Brand: "+brand+"\nModel: "+model+"\nYear: "+year+"\nPrice: $"+price+"\nColor: "+color;
    }

}
