package HeadFirst;
import java.util.*;

public class SampMAin {
    public static void main(String[] args) {
        Sample1 s1= new Sample1();
        Sample2 s2= new Sample2();
        String o="";

        List<Integer> nums= List.of(1,2,3,4,5);
        for(int i=0;i<=nums.size();i++)
            o+=nums.get(i)+" ";
        /*for (int num:nums
             ) {
            o+=nums+" ";
        }*/
        System.out.println(o);
        /*int x=1;
        double y= 73.89358237459;
        o=o+x+y;
        System.out.println(o);
        if(s1.equals(s2)){
            System.out.println(" equal");
        }
        else{
            System.out.println("not equal");
        }*/
    }
}
