package euler;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrimeNo {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int input=Integer.parseInt(JOptionPane.showInputDialog("Enter the number upto which you need the prime numbers: "));
        /*System.out.println("Enter the number upto which you need the prime numbers: ");
        int input= scan.nextInt();*/
        int i;
        boolean p=false;
        if(input==1){
            JOptionPane.showMessageDialog(null,"1 is not a prime number");
            //System.out.println();
        } else if (input==2) {
            JOptionPane.showMessageDialog(null,"2 is a prime number");
            //System.out.println("");

        }
        else{
            for(i=2;i<=input;i++){
                for(int x=2;x<i;x++){
                    if(i%x==0){
                        p=true;
                    }

                }
                if(p==false){
                    JOptionPane.showMessageDialog(null,i);
                    //System.out.print(i+" ");
                }
                p=false;
            }
        }

    }
}
