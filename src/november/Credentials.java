package november;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Credentials {
    Map<String,String> mp= new HashMap<>();
    String user;
    String pass;
    Scanner scan= new Scanner(System.in);
    public void create(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Username :");
        user= scan.next();
        System.out.println("Enter password :");
        pass= scan.next();
        mp.put(user,pass);
    }
    public void disp(){
        Set<Map.Entry<String, String>> entries = mp.entrySet();
        for (Map.Entry<String, String> ent: entries) {
            System.out.println("Username ="+ent.getKey()+" & Password ="+ent.getValue());
        }
        /*Set<Map.Entry<String, String>> entries = mp.entrySet();
        for (Map.Entry<String, String> ent:entries) {

        }
        System.out.println(mp);*/
    }
    public void update(){
        System.out.println("Enter username to be updated :");
        user= scan.next();
        if(mp.containsKey(user)){
            System.out.println("Enter password for username : "+user);
            pass=scan.next();
            mp.put(user,pass);
        }
        else{
            System.out.println("Username not found");
        }
    }
}
