package assignments.arithmetic;

public class Solution extends Arithmetic{
    static int x=42;
    static int y=13;
    public static void main(String[] args){
        Adder adder= new Adder();
        int z= adder.add(x,y);
        /*double y= adder.add(20,22);
        double z= adder.add(30,25);*/

        String name=adder.getClass().getSuperclass().getName();
        System.out.println("My super class is :"+name);
        System.out.println(x+ " "+ y+" "+z);

    }
}
