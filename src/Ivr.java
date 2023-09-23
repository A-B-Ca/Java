import java.util.Scanner;
import java.lang.*;
public class Ivr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char esc;
        do {
        System.out.println("Press 1 for English \n Press 2 for French \n Press 3 for Spanish \n Enter your choice :");
        int input = scan.nextInt();


            switch (input) {
                case 1:
                    System.out.println("You have selected English");
                    System.out.println("Press 1 for Internet \n Press 2 for Mobile \n Press 3 for TV \\n Enter your choice :\"");
                    int inp2 = scan.nextInt();
                    switch (inp2) {
                        case 1:
                            System.out.println("You have Selected Internet. Thank YOU!");
                            break;
                        case 2:
                            System.out.println("You have Selected Mobile. Thank YOU!");
                            break;
                        case 3:
                            System.out.println("You have Selected TV. Thank YOU!");
                            break;
                        default:
                            System.out.println("Enter a valid input");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Vous avez sélectionné Français");
                    System.out.println("Appuyez sur 1 pour Internet \n Appuyez sur 2 pour mobile \n Appuyez sur 3 pour TV \n Entrez votre choix :");
                    int inp3 = scan.nextInt();
                    switch (inp3) {
                        case 1:
                            System.out.println("You have Selected Internet. Thank YOU!");
                            break;
                        case 2:
                            System.out.println("You have Selected Mobile. Thank YOU!");
                            break;
                        case 3:
                            System.out.println("You have Selected TV. Thank YOU!");
                            break;
                        default:
                            System.out.println("Enter a valid input");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Vous avez sélectionné l'espagnol");

                    System.out.println("Presione 1 para Internet \n Pulsa 2 para móvil\n Presione 3 para TV \n Ingrese su elección :");
                    int inp4 = scan.nextInt();
                    switch (inp4) {
                        case 1:
                            System.out.println("You have Selected Internet. Thank YOU!");
                            break;
                        case 2:
                            System.out.println("You have Selected Mobile. Thank YOU!");
                            break;
                        case 3:
                            System.out.println("You have Selected TV. Thank YOU!");
                            break;
                        default:
                            System.out.println("Enter a valid input");
                            break;

                    }
                    break;

                default:
                    System.out.println("Enter a valid input");
                    break;
            }
            System.out.println("Press q to exit or c to conitune");
            esc=scan.next().charAt(0);
        }while(esc!='q');


    }
}
