package codewithjohn;

public class ThreadSample implements Runnable{
    int x=1;
    public void run(){
        System.out.println("RUN");
        x++;
    }

    public static void main(String[] args) {

        ThreadSample ts= new ThreadSample();
        Thread abj= new Thread(ts);
        abj.start();
        System.out.println("MAIN");
        System.out.println("MAIN");System.out.println("MAIN");
        System.out.println("MAIN");
        System.out.println("MAIN");System.out.println("MAIN");
        System.out.println("MAIN");
        System.out.println("MAIN");
        abj.start();


    }
}
