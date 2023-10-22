package bankassignment;
import java.util.Scanner;

public class Bank {
   private String accntName;
   private String accntType;
   private long accntNumber;
   private double accntBal;
   Scanner scan = new Scanner(System.in);


    public String getAccntName() {
        return accntName;
    }

    public String getAccntType() {
        return accntType;
    }

    public long getAccntNumber() {
        return accntNumber;
    }

    public double getAccntBal() {
        return accntBal;
    }

    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }


    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw");
        double inp2= scan.nextDouble();
        if(inp2>0 && inp2<=accntBal){
            accntBal=accntBal-inp2;
            System.out.println("Withdraw Successful, your current account balance is: "+accntBal);

        }
        else if(inp2>accntBal){
            System.out.println("You have insufficient balance");
        }
        else{
            System.out.println("Enter a valid input");
        }

    }
}
