package octoberClass;

public class Calculator {
    int inp,inp2;
    Calculator(){

    }
    Calculator(int inp,int inp2){
        this.inp=inp;
        this.inp2=inp2;

    }
    public void add(){
        int add=inp+inp2;
        System.out.println("Sum of "+inp+" and "+inp2+" is "+ add);

    }
    public void subtract(){
        int sub= inp-inp2;
        System.out.println("Difference of "+inp+" and "+inp2+" is "+ sub);
    }
    public void multiply(){
        int mul= inp*inp2;
        System.out.println("Multiplication of "+inp+" and "+inp2+" is "+ mul);
    }
    public void divide(){
        int div= inp/inp2;
        System.out.println("Division of "+inp+" and "+inp2+" is "+ div);
    }



}
