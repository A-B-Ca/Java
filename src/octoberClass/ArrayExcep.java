package octoberClass;

import java.security.spec.ECGenParameterSpec;

public class ArrayExcep {
    public static void main(String[] args) {
       int[] arr=  new int[5];
       int x=1;
       try {
           for (int i = 0; i < 6; i++) {
               arr[i] = x;
               x++;
           }
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Array out of bound");
       }



    }
}
