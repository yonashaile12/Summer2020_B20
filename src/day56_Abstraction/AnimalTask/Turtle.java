package day56_Abstraction.AnimalTask;

public class Turtle extends Animal implements Swimmable{
    @Override
    public void eat() {
        System.out.println("Turtle is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Turtle is sleeping");
    }

    @Override
    public void drink() {
        System.out.println("Turtle is drinking");
    }

    @Override
    public void swim() {
        System.out.println("Turtle is swimming");
    }
}
