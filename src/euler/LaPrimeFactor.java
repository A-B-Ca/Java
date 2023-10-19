package euler;

import java.util.Scanner;

public class LaPrimeFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the largest prime factor: ");
        long input = scan.nextLong();
        long i;
        boolean p = false;
        long lprime=1;
        if (input == 1) {
            System.out.println("1 is not a prime number");
        } else if (input == 2) {
            System.out.println("2 is a prime number");

        } else {
            for (i = 2; i <= input; i++) {
                for (long x = 2; x < i; x++) {
                    if (i % x == 0) {
                        p = true;

                    }

                }
                if (p == false) {
                    System.out.print(i + " ");
                    if(input%i==0){
                        lprime=i;
                    }
                }
                p = false;
            }
            System.out.println();
            System.out.println("GPF is  :"+lprime);
        }

    }
}
