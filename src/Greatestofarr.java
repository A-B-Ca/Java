import java.util.Scanner;
public class Greatestofarr {
    public static void main(String[] args) {
        int larger=0;
        Scanner scan= new Scanner(System.in);
        int[] arr= new int[7];
        System.out.println("Enter all the 7 numbers in array one by one");
        for(int i=0;i<7;i++){
            arr[i]= scan.nextInt();
        }
        larger=arr[0];
        for(int y=0;y<6;y++){
            if(larger<arr[y+1]){
                larger=arr[y+1];
            }


        }
        System.out.println("Largest of all numbers is:"+larger);
    }
}
