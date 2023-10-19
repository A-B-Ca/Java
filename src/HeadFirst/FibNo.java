package HeadFirst;
import java.util.Scanner;

public class FibNo {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number you want to check the position for in Fibonacci sequence");
        int input= scan.nextInt();
        int num1= 0;
        int num2=1;
        int fib=0;
        int count=3;
        boolean b=false;
        //System.out.println(num1);
        //System.out.println(num2);
        if(num1==input){
            System.out.println("Entered number is in first position");

        } else if (num2==input) {
            System.out.println("Entered number is in second position");

        }
        else {
            for (int i = 0; i <= input; i++) {
                fib = num2 + num1;
                //System.out.println(fib);
                num1 = num2;
                num2 = fib;
                if (input==fib){
                    System.out.println("Entered number "+input+" is at position "+count);
                    b=true;
                    break;
                }
                count++;

            }
            if(b==false){
                System.out.println("number not found in fib sequence");
            }
        }

    }
}
