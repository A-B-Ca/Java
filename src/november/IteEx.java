package november;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteEx {
    public static void main(String[] args){
        List<String> l1= new ArrayList<>();
        List<String> l2= List.of("A","B","C","D");
        Iterator<String> it = l2.iterator();
        while(it.hasNext()){
            String sample=it.next();
            if(sample==""){
                System.out.println("Found!!");
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
