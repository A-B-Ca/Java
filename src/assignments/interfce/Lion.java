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
        a.sleep();
    }
   Animal a = new Animal() {
       @Override
       public void locomotion() {

       }

       @Override
       public void eat() {

       }

       @Override
       public void communication() {

       }

       @Override
       public void sleep() {
           System.out.println("GRhhhh GRhhh Grhhh");
       }
   };
}
