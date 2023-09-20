import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner ag=new Scanner(System.in);
        int num1 = ag.nextInt();
        if(num1<16){
            System.out.println("You are not eligible for license");
        }
        else if(num1>16 && num1<19){
            System.out.println("You cannot drive on Highway400 series");
        }
        else if (num1>19 && num1<65){
            System.out.println("You are eligible to drive all over Canada");
        }
        else{
            System.out.println("Ride Safe");
        }
        boolean G = true;
        if(num1<19 && G){
            System.out.println("You should have blood alchohol level to 0.0");

        }
        else{
            System.out.println("You should have blood alcohol level under 0.08");
        }

    }
}
