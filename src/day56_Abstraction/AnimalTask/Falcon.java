package day56_Abstraction.AnimalTask;

public class Falcon extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Falcon is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Falcon is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Falcon is flying");
    }
}
