import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number upto you need the even and odd numbers:");
        Scanner scan=new Scanner(System.in);
        int inp= scan.nextInt();
        int sum=0;

        for(int i=0;i<=inp;i++){
            if(i%2==0){
                System.out.println(i);
                sum=sum+i;
            }

        }
        System.out.println("Sum of even numbers upto "+inp+"is :"+sum);
        int sm=0;
        for(int x=0;x<=inp;x++){
            if(x%2!=0){
                System.out.println(x);
                sm=sm+x;
            }

        }
        System.out.println("Sum of odd numbers upto "+inp+"is :"+sm);
    }
}
