import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Print the number upto which you need the sum of natural numbers");
        Scanner scan=new Scanner(System.in);
        int op = scan.nextInt();
        int x=1;
        int sum=0;
        while(x<=op){
            sum = sum+x;

            x=x+1;


        }
        System.out.println("Sum is :"+sum);
    }
}
