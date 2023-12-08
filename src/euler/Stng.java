package euler;

public class Stng {
    public static void main(String[] args) {
        System.out.println(endsLy("yak123ly"));


    }

    public static boolean endsLy(String str) {
        if (str.length() < 2)
            return false;
        else {
            if (str.substring(str.length() - 2, str.length())=="ly")
                return true;
            else
                return false;

        }
    }
}
