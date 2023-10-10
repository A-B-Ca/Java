import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int larger=0;
        int m=0;
        Scanner scan= new Scanner(System.in);
        int[] arr= new int[7];
        System.out.println("Enter all the 7 numbers in array one by one");
        for(int i=0;i<7;i++){
            arr[i]= scan.nextInt();
        }
        int[] arr2= new int[7];
        //larger=arr[0];
        int a=0;

        //for (int z=0;z<7;z++) {
            for (int y = 0; y < arr.length; y++) {
                for(int j=0;j<arr.length;j++){
                    if(arr[y]<arr[j]){
                        a=arr[y];
                        arr[y]=arr[j];
                        arr[j]=a;
                    }
                }
                /*if (arr[y] < arr[y + 1]) {
                    arr2[y] = arr[y + 1];
                }
                System.out.println(arr2[y]);*/

            }
        for(int i=0;i<7;i++){
            System.out.println(arr[i]);
        }
            //arr2[z]=larger;

        //}

    }
}
