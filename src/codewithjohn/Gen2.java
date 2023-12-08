package codewithjohn;

import java.util.ArrayList;
import java.util.List;

public class Gen2 {

    public static void main(String[] args){
        Test(2,2);
        Test("String",12);
        Test(2.203,'a');
        List<String> l1= List.of("a","b","c","d","e");
        sss(l1);
        List l2= new ArrayList();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        sss(l2);


    }
    public static <T> void Test(T x, T y){
        System.out.println(x);
    }
    public static void sss(List<?> x){
        System.out.println(x);
    }
}
