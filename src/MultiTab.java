import java.util.Scanner;
public class MultiTab {
    public static void main(String[] args) {
        System.out.println("Which table you want");
        Scanner scan= new Scanner(System.in);
        int op= scan.nextInt();
        int x=1;
        int mul=1;
        do{
            mul=x*op;
            System.out.print(mul+" ");
            x=x+1;
        }while(x<11);
        int  y=1;
        System.out.println(" ");
        do{
            mul=y*3;
            System.out.print(mul+" ");
            y=y+1;
        }while(y<11);
    }
}
