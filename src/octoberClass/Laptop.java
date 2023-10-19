package octoberClass;

public class Laptop extends  Computer {
    String model;
    Laptop(){
        super();
        model= "HP";
        System.out.println(model);
        System.out.println(super.ram);
    }
    public static void main(String[] args){
        Laptop l1=new Laptop();
        l1.print();

    }
}
