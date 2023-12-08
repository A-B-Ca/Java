package HeadFirst;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamm {

    public static void main(String[] args) {


        String s1 = "I am a computer";
        String[] ords= s1.split("\\s");
        List<String> l1 = List.of("I", "am", "a", "computer");
        l1=l1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println();
        l1.forEach(col-> System.out.println(col));
    }
}
