package HeadFirst;
import java.util.ArrayList;
import java.util.Scanner;

public class ContMain {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        ArrayList<Contact> arrayList= new ArrayList<Contact>();
        System.out.println("Contacts");
        int input=0;
        while (input!=4) {
            System.out.println("1. Add Contact\n2. View all contacts\n3. Search Contacts\n4. Exit");
            input = scan.nextInt();
            switch (input){
                case 1:
                    Contact a = new Contact();
                    arrayList.add(a);
                    System.out.println("Contact added successfully");
                    break;
                case 2:
                    int j=1;
                    System.out.println("Contacts List");
                    for(Contact i:arrayList){

                        System.out.print(j+".");
                        i.display();
                        j++;
                    }
                    break;
                case 3:
                    System.out.println("Enter first name or last name to search:");
                    String find=scan.next();
                    boolean bh=false;
                    for(Contact c:arrayList){
                        int u=c.search(find);
                        if(u==1){
                            bh=true;
                        }

                    }
                    if(bh==false){
                        System.out.println("Sorry! Couldn't find what you where looking for");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");



            }

        }



    }
}
