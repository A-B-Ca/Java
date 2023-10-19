package assignments.interfce;

public class Main {
    public static void main(String[] args){
        Lion lion= new Lion();
        lion.sleep();
        lion.eat();
        lion.locomotion();
        lion.communication();
        System.out.println();

        Monkey monkey= new Monkey();
        monkey.climb();
        monkey.swing();
        monkey.sleep();
        monkey.locomotion();
        monkey.eat();
        monkey.communication();
        System.out.println();

        Penguin penguin = new Penguin();
        penguin.sleep();
        penguin.eat();
        penguin.swim();
        penguin.communication();
        penguin.locomotion();
        System.out.println();

        Jaguar jaguar = new Jaguar();
        jaguar.climb();
        jaguar.sleep();
        jaguar.communication();
        jaguar.eat();


    }
}
