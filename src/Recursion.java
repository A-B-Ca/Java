import java.util.Scanner;
public class Recursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enteer the number from you want to add");
        int inp1= scan.nextInt();
        System.out.println("Enter the number uptowich you need the sum");
        int inp2= scan.nextInt();
        int result= sum(inp1, inp2);
        System.out.println(result);
    }

    public static int sum(int y, int x){
        int total;
        if(x>y){
            return total= x+sum(y,x-1);
        }
        else{
            return y;
        }


    }
}
