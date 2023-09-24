package AssignmentCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char esc='y';
        System.out.println("Hello World");
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to CALCULATOR");
        Addition a1= new Addition();
        Subtraction1 s1= new Subtraction1();
        Multiplication m1= new Multiplication();
        Division d1= new Division();
        Modulus l1=new Modulus();

        do{
            System.out.println("Please select the operation \n Enter 1 for addition \n Enter 2 for subtraction \n Enter 3 for multiplication \n Enter 4 for Division \n Enter 5 for Modulus ");
            int op = scan.nextInt();
            switch(op){
                case 1:
                    a1.add();
                    break;
                case 2:
                    s1.sub();
                    break;
                case 3:
                    m1.mul();
                    break;
                case 4:
                    d1.div();
                    break;
                case 5:
                    l1.mod();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("You are in the main menu");
            System.out.println("Press y to continue n to exit");
            esc=scan.next().charAt(0);
        }while(esc!='n');
    }
}
