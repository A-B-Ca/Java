package assignments.interfce;

public class Jaguar extends Lion implements Climbable {

    @Override
    public void climb() {
        System.out.println("Climbing trees");
    }

    @Override
    public void swing() {
        System.out.println("Occassionally jumps from tree to hunt down its prey");
    }
}
