import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten",0));

    }
    public static String missingChar(String str, int n) {
        String a= str.substring(0,n);
        String b =str.substring((n+1),str.length());
        return a+b;

    }


}
