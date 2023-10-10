package HeadFirst;
import java.util.Scanner;

public class Contact {
    Scanner scan= new Scanner(System.in);
    private String contact;
    private String fname,lname,email;
    private long phNumber;

    Contact(){
        System.out.println("Enter the first name ");
        fname= scan.next();
        System.out.println("Enter the second name ");
        lname=scan.next();
        contact=fname.concat(lname);
        System.out.println("Enter the phone number");
        phNumber=scan.nextLong();
        System.out.println("Enter the email id");
        email=scan.next();

    }
    public void display(){

        System.out.println(fname);
        System.out.println("  "+lname);
        System.out.println("  "+phNumber);
        System.out.println("  "+email);

    }
    public int search(String find){
        if(find.equals(fname) || find.equals(lname)){
            System.out.println("Matching contact details:");
            display();
            return 1;
        }
        else{
            return 0;
        }

    }

}
