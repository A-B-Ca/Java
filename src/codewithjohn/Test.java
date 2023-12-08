package codewithjohn;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List a=  new ArrayList<>();
        a.add(1);
        a.add("as");
        a.add(23.2);
        int c= (int)a.get(0);
        String h= (String) a.get(1);
        Double f= (Double)a.get(2);

        System.out.println(c+h+f);
        Test t = new Test();
        t.test(23.23232);
        t.test("Hello");
        t.test(123);
        t.test('a');
    }
    public <T> T test(T x){
        System.out.println(x);
        return x;
    }
}
