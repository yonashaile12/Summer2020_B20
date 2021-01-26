package day56_Abstraction.AnimalTask;

public class Parrot extends Animal implements Flyable, Playable, Talkative  {

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("parrot is sleeping");
    }


    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void play() {
        System.out.println("Parrot is playing");
    }

    @Override
    public void talk() {
        System.out.println("Parrot is talking");
    }


}