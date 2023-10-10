import java.util.Scanner;

public class Swaptwo {
    public static void main(String[] args) {
        System.out.println("Enter number x:");
        Scanner scan= new Scanner(System.in);
        int x= scan.nextInt();
        System.out.println("Enter number y:");

        int y= scan.nextInt();

        x=x+y-x;
        y=y+x-y;
        System.out.println(x+"\n"+y);

    }
}
