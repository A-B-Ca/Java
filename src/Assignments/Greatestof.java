package Assignments;
import java.util.Scanner;

public class Greatestof {

    public static void main(String[] args) {
        int sum;
        char esc='y';
        Scanner scan= new Scanner(System.in);
        do {
            System.out.println("Enter the three numbers");
            int inp1 = scan.nextInt();
            int inp2 = scan.nextInt();
            int inp3 = scan.nextInt();
            if (inp1 >= inp2) {
                sum = inp1;
            } else if (inp2 >= inp3) {
                sum = inp2;
            } else {
                sum = inp3;
            }

            System.out.println("Greatest of 3 numbers is " + sum);
            System.out.println("Do you want to continue");
            System.out.println("Press y to continue n to exit");
            esc=scan.next().charAt(0);
        }while(esc!='n');
    }
}
