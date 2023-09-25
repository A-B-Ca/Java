package Assignments;
import java.util.Scanner;

import static java.lang.System.exit;

public class Vowel {


    public static void main(String[] args) {
        char str;
        char esc='y';
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter the character");
            String i = scan.next();
            if (i.length() > 1) {
                System.out.println("Enter a single character");
            } else {
                str = i.charAt(0);

                if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u') {
                    System.out.println(str+" is a \u001B[1m VOWEL \u001B[0m");
                } else if (str >= 'a' && str <= 'z') {
                    System.out.println(str+" is a \u001B[1m CONSONANT \u001B[0m");
                } else {
                    System.out.println("Error:Enter an \u001B[1m ALPHABET \u001B[0m");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Do you want to continue \nEnter any key to continue\nn to exit");
            esc=scan.next().charAt(0);
        }while(esc!='n');

    }
}
