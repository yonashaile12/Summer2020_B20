package day51_Exceptions.PetTask;
/*
2. create a sub class of Pet called Dog
                    override the instance methods:
                        eat(): dog eats Chicken
                        drink(): dog drinks water
                        sleep(): dog sleeps on the bed
 */
public class Dog extends Pet{

    double price;
    public Dog(String name, String breed, char gender, int age, String color,double price) {
        super(name, breed, gender, age, color);
        this.price = price;
    }
    /*
    public String toString(){
        return super.toString();
    }
     */


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

