package octoberClass;

import java.util.ArrayList;

public class StuuMain {
    public static void main(String[] args) {
        Student<Integer, String> s1= new Student<>(7,"Asher");
        Student<Integer,String> s2 = new Student<>(8,"Arun");
        Student<Integer,Integer> s3 = new Student<>(111,1001);
        System.out.println(s2.getId());
        System.out.println(s2.getName());
        System.out.println(s3.getName());
        System.out.println(s3.getId());

        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(0,5);
        System.out.println(a);

        int[] sgg= new int[2];
        sgg[0]=1;
        sgg[1]=2;
        sgg[0]=3;
        System.out.println(sgg[0]+sgg[1]);


    }
}
