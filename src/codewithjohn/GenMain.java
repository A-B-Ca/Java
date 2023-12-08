package codewithjohn;

public class GenMain {
    public static void main(String[] args){
        Gennn<Integer> g1= new Gennn(4);
        g1.print();

        Gennn<String> g2= new Gennn<>("ABCD");
        g2.print();


    }
}
