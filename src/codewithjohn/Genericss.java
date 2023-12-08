package codewithjohn;

import java.util.ArrayList;
import java.util.List;

public class Genericss {
    int i;

    public static void main(String[] args) {

        Test(1);
        Test("Hello");

        Test(12.22);
        List<String> l1= new ArrayList<>();
        l1.add("acc");
        lst(l1);

    }
    public static <T>void Test(T value){
        System.out.println(value);
    }

    public static void lst(List<?> l1){
        System.out.println(l1);

    }
}
