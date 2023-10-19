package assignment_calculator;
import java.util.Scanner;

public class Addition {
    char esc;
    Scanner scan = new Scanner(System.in);
    Calculator c1 = new Calculator();
    double a;
    double b;
    double c;

    public void add() {
        System.out.println("Addition ");
        do {
            System.out.println("Do you want to add 2 or 3 nummbers");
            int inp = scan.nextInt();
            if (inp == 2) {
                System.out.println("Enter the first number");
                double a = scan.nextDouble();
                System.out.println("Enter the second number");
                double b = scan.nextDouble();
                c1.sum(a, b);
            } else if (inp==3) {
                System.out.println("Enter the first number");
                double a = scan.nextDouble();
                System.out.println("Enter the second number");
                double b = scan.nextDouble();
                System.out.println("Enter the third number");
                double c = scan.nextDouble();
                c1.sum(a,b,c);
            }
            else{
                System.out.println("Enter a valid input");
            }
            System.out.println("Do you want to continue adding more numbers");
            System.out.println("Press y to continue n to go back to main menu");
            esc=scan.next().charAt(0);

        }while(esc!='n');
    }
}
