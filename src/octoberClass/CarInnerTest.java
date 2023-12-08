package octoberClass;

public class CarInnerTest {
    public void run(){
        System.out.println("Ignition");
        class Engine{
            public void engineStart(){
                System.out.println("Engine Started");
            }
        }
        Engine e= new Engine();
        e.engineStart();
    }
    public class Accelerate{
        public void accelerate(){
            System.out.println("Accelerate");
        }
    }
    public static void main(String[] args){
        CarInnerTest car = new CarInnerTest();
        car.run();
        CarInnerTest.Accelerate car2= car.new Accelerate();
        car2.accelerate();

    }
}
