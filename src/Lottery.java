import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        int x=0;
        int lottery=56;
        Scanner scan=new Scanner(System.in);
        System.out.println("Press q to exit");
        char esc= scan.next().charAt(0);
        while(esc!='q') {
            System.out.println("Enter your lucky number");
            int inp = scan.nextInt();
            if(inp==lottery) {
                System.out.println("Congratulation! You have won the Mega Lottery");
            }
            else{
                System.out.println("Hard luck! Better luck next time");
            }
        }
    }
}
