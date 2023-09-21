import java.util.Scanner;
class Lottery {
    public static void main(String[] args) {
        int x=0;
        int lottery=56;
        Scanner scan=new Scanner(System.in);
        char esc;
        do {
            System.out.println("Enter your lucky number");
            int inp = scan.nextInt();
            if(inp==lottery) {
                System.out.println("Congratulation! You have won the Mega Lottery");
                System.out.println("Hurray!");
            }
            else{
                System.out.println("Hard luck! Better luck next time");
            }
            System.out.println("Press q to exit or press c to continue");
            esc= scan.next().charAt(0);
        }while(esc!='q');
    }
}
