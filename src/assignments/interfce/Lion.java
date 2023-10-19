package assignments.interfce;

public class Lion extends Animal{
    @Override
    public void locomotion() {
        System.out.println("Roaming around");
    }

    @Override
    public void eat() {
        System.out.println("Hunting its Prey and eating them");
    }

    @Override
    public void communication() {
        System.out.println("ROAR");
    }
}
