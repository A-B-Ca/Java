package euler;
import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number upto which you need the even Fibonacci sequence");
        int input= scan.nextInt();
        int fib=0;
        int increment=1;
        int sum=0;
        System.out.println(fib);
        //System.out.println(increment);
        FibMethod fb= new FibMethod();
        for(int i=2;i<input;i++){
            sum= fb.fibMethod(fib,increment);
            if(sum%2==0)
            System.out.println(sum);

            fib=increment;
            increment=sum;



        }
    }
}
