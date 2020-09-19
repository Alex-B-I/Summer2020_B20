package day56_Abstraction.AnimalTask;

public class Snake extends Animal implements Swimmable,Playable{
    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Snake is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Snake is playing");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming");
    }
}
