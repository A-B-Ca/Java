import java.util.Scanner;
public class CalMain {
    public static void main(String[] args) {
        char esc;
        int result;
        System.out.println("Welcome to Calculator");


        CalculatorObj c1 = new CalculatorObj();
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter first number");
            int x= scan.nextInt();
            System.out.println("Enter second number");
            int y= scan.nextInt();
            System.out.println("Enter operator \n Enter 1 for addition \n Enter 2 for subtraction \n Enter 3 for multiplication \n Enter 4 for Division ");
            int op = scan.nextInt();
            switch(op)  {
                case 1:
                    result=c1.sum(x,y);
                    System.out.println("Answer is "+result);
                    break;
                case 2:
                    result=c1.sub(x,y);
                    System.out.println("Answer is "+result);
                    break;
                case 3:
                    result=c1.mul(x,y);
                    System.out.println("Answer is "+result);
                    break;
                case 4:
                    result=c1.div(x,y);
                    System.out.println("Answer is "+result);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Press q to exit or any other key to continue");
            esc = scan.next().charAt(0);
        }

        while(esc!='q');

    }
}