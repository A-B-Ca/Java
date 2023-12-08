package november;

import java.util.*;
import java.util.stream.Collectors;

public class HashEx {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Credentials crd= new Credentials();
        int esc=0;
        List<String> ar1 = List.of("A","b","c","d","AA","AB", "123","@456");
        List<String> r= ar1.stream().sorted((one,tow)->one.compareTo(tow)).limit(4).collect(Collectors.toList());
        System.out.println(r);
        /*ar1.forEach(System.out::println);
        List<String> res=  ar1.stream().limit(2).collect(Collectors.toList());
        System.out.println(res);*/


        do{

            System.out.println("Enter your choice");
            System.out.println("Press \n1. to Enter new credentials\n2. to Update Credentials\n3. to Display Credentials\n 0 to exit");
            esc= scan.nextInt();
            switch (esc) {
                case 1:
                    crd.create();
                    break;
                case 2:
                    crd.update();
                    break;
                case 3:
                    crd.disp();
                    break;
                default:
                    System.out.println("Enter a valid choice");


            }


        }while(esc!=0);


    }


}
