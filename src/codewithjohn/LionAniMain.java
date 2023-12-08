package codewithjohn;

import java.util.*;

public class LionAniMain {
    public static void main(String[] args) {

        Animal ccc= (a)->System.out.println("123"+a);
        print (ccc);
        print((a)->System.out.println("Grrrer!"+a));
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Derick", "Love", "John", "Lidiya"));
        String[] j= {"A","b","c","d","e","f"};
        System.out.println(j);
        System.out.println(
                Arrays.toString(j)
        );

        Iterator<String> iterator = arr.iterator();
        arr.forEach(name-> System.out.println(name+"!"));
        arr.forEach(System.out::println);
        Set<String> s= new HashSet<>(10,.10f);
        s.addAll(arr);

        System.out.println(s);
        Map<String, Integer> mp= new HashMap<>();
        mp.put("ASHER",4812);
        mp.put("ASHE",4812);
        mp.put("ASH",4812);
        //System.out.println(mp);
        System.out.println(mp.entrySet());
        Set<String> ts= new TreeSet<>((one,two)->one.compareTo(two));

    }
    public static void print(Animal ani){
        ani.cry("abc");

    }
}
