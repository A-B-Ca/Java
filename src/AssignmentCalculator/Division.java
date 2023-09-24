package AssignmentCalculator;

import java.util.Scanner;

public class Division {
    char esc;
    Scanner scan = new Scanner(System.in);
    Calculator c4 = new Calculator();
    double a;
    double b;
    double c;

    public void div() {
        System.out.println("Division ");
        do {
            System.out.println("Do you want to divide  2 or 3 numbers");
            int inp = scan.nextInt();
            if (inp == 2) {
                System.out.println("Enter the first number");
                a = scan.nextDouble();
                System.out.println("Enter the second number");
                b = scan.nextDouble();
                c4.div(a, b);
            } else if (inp==3) {
                System.out.println("Enter the first number");
                a = scan.nextDouble();
                System.out.println("Enter the second number");
                b = scan.nextDouble();
                System.out.println("Enter the third number");
                c = scan.nextDouble();
                c4.div(a,b,c);
            }
            else{
                System.out.println("Enter a valid input");
            }
            System.out.println("Do you want to continue dividing more numbers");
            System.out.println("Press y to continue n to go back to main menu");
            esc=scan.next().charAt(0);

        }while(esc!='n');
    }
}
