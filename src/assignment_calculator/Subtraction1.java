package assignment_calculator;

import java.util.Scanner;

public class Subtraction1 {
    char esc;
    Scanner scan = new Scanner(System.in);
    Calculator c2 = new Calculator();
    double a;
    double b;
    double c;

    public void sub() {
        System.out.println("Subtraction ");
        do {
            System.out.println("Do you want to subtract 2 or 3 numbers :");
            int inp = scan.nextInt();
            if (inp == 2) {
                System.out.println("Enter the first number");
                a = scan.nextDouble();
                System.out.println("Enter the second number");
                b = scan.nextDouble();
                c2.sub(a, b);
            } else if (inp==3) {
                System.out.println("Enter the first number");
                a = scan.nextDouble();
                System.out.println("Enter the second number");
                b = scan.nextDouble();
                System.out.println("Enter the third number");
                c = scan.nextDouble();
                c2.sub(a,b,c);
            }
            else{
                System.out.println("Enter a valid input");
            }
            System.out.println("Do you want to continue subtraction ");
            System.out.println("Press y to continue n to go back to main menu");
            esc=scan.next().charAt(0);

        }while(esc!='n');
    }
}

