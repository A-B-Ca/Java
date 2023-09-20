import java.util.Scanner;
public class SwitchCalc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        double x = scan.nextDouble();
        System.out.println("Enter second number");
        double y = scan.nextDouble();
        System.out.println("Enter operator \n Enter 1 for addition \n Enter 2 for subtraction \n Enter 3 for multiplication \n Enter 4 for Division \n Enter 5 for Modulus");
        int op = scan.nextInt();
        switch (op){
            case 1:
                double sum=x+y;
                System.out.println("Sum of "+x+ "and "+y+"is "+sum);
                break;
            case 2:
                double minus=x-y;
                System.out.println("Subtraction of "+x+ " and " +y+ "is "+minus);
                break;
            case 3:
                double mul=x*y;
                System.out.println("Multiplication of "+x+ " and" +y+ " is "+mul);
                break;
            case 4:
                double div=x/y;
                System.out.println("Division of "+x+ " and " +y+ " is "+div);
                break;
            case 5:
                double mod=x%y;
                System.out.println("Modulus of "+x+ " and " +y+ " is "+mod);
                break;
            default:
                System.out.println("Wrong inpt");
                break;

        }
    }
}

