package HeadFirst;

import euler.Fibonacci;

class Exp {
    public static void main(String[] args) {
        Fibonacci f= new Fibonacci();
        int lhj=Fibonacci.fib(5);
        System.out.println(lhj);
        long s = 1000000000;
        long t = 1_000_000_000;
        long h= 1000000000;
        String q=String.format("There are %,.2f people in kerala",30000000.564564);
        System.out.println(q);
        String l= "true";
        boolean b = Boolean.parseBoolean(l);
        System.out.println(b);

        myMethod();


    }
    public static void myMethod(){
        System.out.println("Hello!");
    }
}
