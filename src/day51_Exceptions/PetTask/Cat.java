package day51_Exceptions.PetTask;

public class Cat extends Pet{

    public Cat(String name, String breed, char gender, int age, String color){
        super(name, breed, gender, age, color);
    }


    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
