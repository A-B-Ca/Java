import java.util.Scanner;
public class CalOnInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        double x = scan.nextDouble();
        System.out.println("Enter second number");
        double y = scan.nextDouble();
        System.out.println("Enter operator \n Enter 1 for addition \n Enter 2 for subtraction \n Enter 3 for multiplication \n Enter 4 for Division \n Enter 5 for Modulus");
        int op = scan.nextInt();
        if(op == 1){
            System.out.println(x+y);
        }
        else if(op==2){
            System.out.println(x-y);
        }
        else if(op==3){
            System.out.println(x*y);
        }
        else if (op==4){
            System.out.println(x/y);
        }
        else if(op==5){
            System.out.println(x%y);
        }
        else{
            System.out.println("Wrong choice");
        }
    }

}

