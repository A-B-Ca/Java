package octoberClass;

public class Computer {
    int ram;
    String processor;
    Computer(){
        ram=8;
        processor="Intel";
    }
    void print(){
        System.out.println("Computer");
        System.out.println("Memory :"+ram +"Gb" +"\n"+"Processor :"+ processor);
    }
}
