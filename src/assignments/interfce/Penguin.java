package assignments.interfce;

public class Penguin extends Animal implements Swimmable{
    @Override
    public void locomotion() {
        System.out.println("Waddling");
    }

    @Override
    public void eat() {
        System.out.println("Hunting fish");
    }

    @Override
    public void communication() {
        System.out.println("Squawking");
    }

    @Override
    public void swim() {
        System.out.println("Swim with their flipp-like-wings");
    }
}
