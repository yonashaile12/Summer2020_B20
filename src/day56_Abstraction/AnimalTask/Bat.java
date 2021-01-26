package day56_Abstraction.AnimalTask;

public class Bat extends Animal implements Flyable {
    @Override
    public void eat() {
        System.out.println("Bat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bat is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying");
    }
}