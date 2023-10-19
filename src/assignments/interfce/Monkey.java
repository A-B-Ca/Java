package assignments.interfce;

public class Monkey extends Animal implements Climbable{
    @Override
    public void locomotion() {
        System.out.println("Running around");
    }

    @Override
    public void eat() {
        System.out.println("Eating fruits");
    }
    @Override
    public void communication(){
        System.out.println("Chattering and Gibbering");
    }
    @Override
    public void climb(){
        System.out.println("Climbing Trees");
    }
    @Override
    public void swing(){
        System.out.println("Swinging from branches to branches");
    }
}
