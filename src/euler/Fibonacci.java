package euler;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 100; // Number of terms in the Fibonacci series to generate
        for (int i=0;i<n;i++)
        System.out.print(fib(i)+" ");
    }
    public static int  fib(int y){
        if(y<=1){
            return y;
        }
        else{
            return fib(y-1)+fib(y-2);
        }
    }


}
