package day51_Exceptions.PetTask;

public class Tiger extends Pet{

    public Tiger(String name, String breed, char gender, int age, String color){
        super(name, breed, gender, age, color);
    }

    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
