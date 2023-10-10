package bank_application;
import java.util.Scanner;

public class Account {
    double bal;
    int accntNO;
    String custName;
    Account(double bal, int accntNO, String custName){
        this.bal=bal;
        this.accntNO=accntNO;
        this.custName=custName;

    }


    int noOfDep=0;
    double amntOfDep=0.00;
    double amntOfWithdraw=0.00;
    int noOfWithdraw=0;
    Scanner scan= new Scanner(System.in);
    public void setAccountBal(){
        System.out.println("Enter the deposit amount");
        double inp= scan.nextDouble();
        if(inp>0){
            bal=bal + inp;
            noOfDep++;
            amntOfDep=amntOfDep+inp;
            System.out.println("Your new account balance is: $"+bal);
        }
        else{
            System.out.println("Enter a valid amount");
        }
    }
    public void getAccountBal(){
        System.out.println(custName+"'s account balance is: $"+bal);
    }
    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw");
        double inp2= scan.nextDouble();
        if(inp2>0 && inp2<=bal){
            bal=bal-inp2;
            System.out.println("Amount withdrawn");
            amntOfWithdraw= amntOfWithdraw+ inp2;
            noOfWithdraw++;

        }
        else if(inp2>bal){
            System.out.println("You have insufficient balance");
        }
        else{
            System.out.println("Enter a valid input");
        }

    }
    public void accountSum(){
        System.out.println(custName+"'s current balance is: $"+bal);
        System.out.println("Total number of deposits in your account is: "+noOfDep);
        System.out.println("Amount of total deposit is: "+amntOfDep);
        System.out.println("Total number of withdrawal in your account is: "+noOfWithdraw);
        System.out.println("Amount of total withdrawal is: "+amntOfWithdraw);
    }
}
