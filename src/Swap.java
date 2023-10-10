import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter number x:");
        Scanner scan= new Scanner(System.in);
        int x= scan.nextInt();
        System.out.println("Enter number y:");

        int y= scan.nextInt();

        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println("Swapped");

        System.out.println("Value of x is :"+x);
        System.out.println("Value of y is :"+y);



    }
}
