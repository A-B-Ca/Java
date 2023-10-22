package bankassignment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScotiaBank sbank= new ScotiaBank("Asher","Savings", 123456,1000.00);
        Scanner scan= new Scanner(System.in);
        char esc='e';

        do {
            System.out.println();
            System.out.println("Enter your options");
            System.out.println(" Press a to check your account balance \n Press b to make a deposit \n Press c to request a withdrawal  \n Press e to exit\n Press f to get account name\n Press g to get account type\n Press h to get accountnumber\n ");
            esc = scan.next().charAt(0);
            switch (esc) {
                case 'a':
                    System.out.println(sbank.getAccntBal());
                    break;
                case 'b':
                    sbank.makeDep();
                    break;
                case 'c':
                    sbank.withdraw();
                    break;
                case 'e':
                    System.exit(0);
                    break;
                case 'f':
                    System.out.println(sbank.getAccntName());
                    break;
                case 'g':
                    System.out.println(sbank.getAccntType());
                    break;
                case 'h':
                    System.out.println(sbank.getAccntNumber());
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;

            }
        }while (esc!='e');
    }
}
