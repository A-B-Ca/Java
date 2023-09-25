import java.util.Scanner;
public class Star {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            System.out.println();
            for (int j = 5; j >i ; j--) {
                System.out.print("*");


            }

        }
        //System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int inp= scan.nextInt();
        String x= (inp%2==0)? "Even":"Odd";
        System.out.println("Its an "+x+" number");

    }
}
