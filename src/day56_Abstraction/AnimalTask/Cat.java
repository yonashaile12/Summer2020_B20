package day56_Abstraction.AnimalTask;

public class Cat extends Animal implements Playable{
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("Cat is drinking Milk");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
