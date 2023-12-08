package assignments.interfce;

public class Jaguar extends Lion implements Climbable {

    Climbable c = new Climbable() {
        @Override
        public void climb() {

        }

        @Override
        public void swing() {

        }
    };


    @Override
    public void climb() {
        System.out.println("Climbing trees");
    }

    @Override
    public void swing() {
        System.out.println("Occasionally jumps from tree to hunt down its prey");
    }
}
