package euler;
import java.util.Scanner;

public class Sumof {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number uptowhich you want the sum");
        int input= scan.nextInt();
        int x=0, sum=0;
        while(x<input){
            if((x%3==0) || (x%5==0)){
                sum=sum+x;
            }
            x++;
        }
        System.out.println(sum);

    }

}
