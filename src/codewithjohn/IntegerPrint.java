package codewithjohn;

public class IntegerPrint<T> {
    T x;
   /* Double y;
    String z;*/
    IntegerPrint(T x){
        this.x=x;
    }
    /*IntegerPrint(Double y){
        this.y=y;
    }

    IntegerPrint(String z){
        this.z=z;
    }*/
    public void Test(){
        System.out.println(x);
    }
    /*public void Test1(){
        System.out.println(y);
    }
    public void Test2(){
        System.out.println(z);
    }*/


    public static void main(String[] args){
        IntegerPrint intprnt = new IntegerPrint(20);
        IntegerPrint dprnt= new IntegerPrint(20.22);
        IntegerPrint sprnt= new IntegerPrint("abc");
        intprnt.Test();
        dprnt.Test();
        sprnt.Test();

    }
}
