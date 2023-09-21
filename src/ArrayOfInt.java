import static java.lang.Math.random;
import java.util.Scanner;
public class ArrayOfInt {
    public static void main(String[] args){
        int i=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total number of numbers to be checked");
        int input=scan.nextInt();
        int[] arr=new int[input];
        System.out.println("Enter "+input+ " numbers one by one");
        for( i=0;i<input;i++){
            arr[i]=scan.nextInt();
            //arr[i]=(int) (Math.random()*10);
            //System.out.println(arr[i]);
        }
        int y=0;
        int large=arr[0];
        int small=arr[0];
        while(y<input){
            if(large<arr[y]){

                large=arr[y];
            }
            if(small>arr[y]){
                small=arr[y];
            }
            y+=1;

        }
        System.out.println("Largest of all the integers is"+large);
        System.out.println("Smallest of all integers is"+small);
    }
}
