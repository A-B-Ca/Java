package bank_application;
import java.util.Scanner;

public class BankApp {



    public static void main(String[] args){





        Scanner scan= new Scanner(System.in);
        Account accnt1= new Account(1000,101, "Asher");
        Account accnt2= new Account(1000,102,"Muza");
        Account accnt3= new Account(1000,103,"Sajeesh");

        Account a=accnt3;

        char esc='y';
        char es='y';
        do {
            System.out.println("Welcome to Banking aplication");
            System.out.println("Please enter you account number\n 101 \n 102 \n 103");
            int inp = scan.nextInt();
            if (inp == 101) {
                a = accnt1;
            } else if (inp == 102) {
                a = accnt2;

            } else if (inp==103) {
                a = accnt3;

            } else {
                System.out.println("Invalid account number");
            }
            do {

                System.out.println("Enter your options");
                System.out.println(" Press a to check your account balance \n Press b to make a deposit \n Press c to request a withdrawal \n Press d to print  account summary \n Press e to exit");
                esc = scan.next().charAt(0);
                switch (esc) {
                    case 'a':
                        a.getAccountBal();
                        break;
                    case 'b':
                        a.setAccountBal();
                        break;
                    case 'c':
                        a.withdraw();
                        break;
                    case 'd':
                        a.accountSum();
                        break;
                    case 'e':
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please select a valid option");
                        break;

                }
                System.out.println("Do you want to continue \nPress any key to contnue \nPress e to go back to main menu");

                esc = scan.next().charAt(0);

            } while (esc != 'e');
            System.out.println("You are in the main menu. Do you want to enter a new account number \nPress any key to enter a new account number \nPress e to exit");
            es = scan.next().charAt(0);
        }while(es != 'e');
    }

}
