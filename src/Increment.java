public class Increment {
    public static void main(String[] args) {
        int x=1;
        System.out.println(x++);//1
        System.out.println(x);//2
        int y=1;
        System.out.println(--y);//0
        System.out.println(y);//0

        x=x++;
        System.out.println(x);//2
        x=++x;
        System.out.println(x);//3


    }
}
