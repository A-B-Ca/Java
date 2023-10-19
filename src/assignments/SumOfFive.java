package assignments;

import java.util.Scanner;

public class SumOfFive {


    public static void main(String[] args){
        int[] arr = new int[5];
        int sum=0;
        int average=0;
        Scanner scan = new Scanner(System.in);
        //int[] arr1=new int[7];
        System.out.println("Enter the numbers one by one ");
        for (int i = 0; i < 5; i++) {

            arr[i] = scan.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum is: "+sum);
        average=(sum/5);
        System.out.println("Average of the above five numbers is:"+average);


    }
}
