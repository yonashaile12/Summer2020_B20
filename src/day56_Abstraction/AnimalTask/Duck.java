package day56_Abstraction.AnimalTask;

public class Duck extends Animal implements Swimmable,Playable,Flyable{
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Duck is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("Duck is drinking");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void play() {
        System.out.println("Duck is playing");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
