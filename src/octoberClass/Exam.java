package octoberClass;
import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the input");
        int n = scan.nextInt();
        String output[]= new String[n];
        int count=1;
        //output[0]="1";
        for(int i =0;i<=(n-1);i++){
                if(count==1){
                    output[i]=1+"";
                }
                else if ((count%3)==0 && (count%5)==0){
                    output[i]="FizzBuzz";
                }
                else if((count%3)==0){
                    output[i]="Fizz";
                }
                else if((count%5)==0){
                    output[i]="Buzz";
                }
                else {
                    output[i]=(count) +"";
                }
                count++;
        }
        System.out.println(Arrays.toString(output));
        /*System.out.println();
        System.out.print("[");
        for(String g:output)
            System.out.print("\""+g+"\""+",");
        System.out.print("]");*/
    }
}
