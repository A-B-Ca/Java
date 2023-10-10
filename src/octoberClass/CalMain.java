package octoberClass;
import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first number");
        int inp= scan.nextInt();
        System.out.println("Enter the second number");
        int inp2= scan.nextInt();
        Calculator cal= new Calculator(inp,inp2);
        cal.add();
        cal.subtract();
        cal.multiply();
        cal.divide();
        String s1="AZAAA";
        String s2="AAZZZ";
        int i=s1.compareTo(s2);
        System.out.println(i);




    }
}
