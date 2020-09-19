package day56_Abstraction.AnimalTask;

public class Dog extends Animal implements Playable,Swimmable{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("Dog is drinking water");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming in the pool");
    }
}
