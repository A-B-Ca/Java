import static java.lang.Math.random;

public class ArrayOfInt {
    public static void main(String[] args){
        int[] arr=new int[10];
        for(int i=0;i<10;i++){

            arr[i]=(int) (Math.random()*10);
            System.out.println(arr[i]);
        }
        int y=0;
        int large=arr[0];
        int small=arr[0];
        while(y<9){
            if(large<arr[y+1]){

                large=arr[y+1];
            }
            if(small>arr[y+1]){
                small=arr[y+1];
            }
            y+=1;

        }
        System.out.println("Largest of all the integers is"+large);
        System.out.println("Smallest of all integers is"+small);
    }
}
