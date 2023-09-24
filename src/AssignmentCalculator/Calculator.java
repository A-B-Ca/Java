package AssignmentCalculator;

public class Calculator {
    public void sum(double a, double b){
        double sm=a+b;
        System.out.println("Sum of "+a+" and "+b+" is :"+sm);

    }
    public void sum(double a, double b, double c){
        double sm= a+b+c;
        System.out.println("Sum of "+a+" , "+b+" and "+c+ "is :"+sm);
    }
    public void sub(double a, double b){
        double sm=a-b;
        System.out.println("Subtraction of "+a+" and "+b+" is :"+sm);

    }
    public void sub(double a, double b, double c){
        double sm=a-b-c;
        System.out.println("Subtraction of "+a+" , "+b+" and "+c+ "is :"+sm);

    }
    public void mul(double a, double b){
        double sm=a*b;
        System.out.println("Multiplication of "+a+" and "+b+" is :"+sm);

    }
    public void mul(double a, double b, double c){
        double sm=a*b*c;
        System.out.println("Multiplication of "+a+" , "+b+" and "+c+ "is :"+sm);

    }
    public void div(double a, double b){
        double sm=a/b;
        System.out.println("Division of "+a+" and "+b+" is :"+sm);

    }
    public void div(double a, double b, double c){
        double sm=(a/b)/c;
        System.out.println("Division of "+a+" , "+b+" and "+c+ "is :"+sm);

    }
    public void md(double a, double b){
        double sm=a%b;
        System.out.println("Modulus of "+a+" and "+b+" is :"+sm);

    }
    public void md(double a, double b, double c){
        double sm=(a%b)%c;
        System.out.println("Modulus of "+a+" , "+b+" and "+c+ "is :"+sm);

    }

}
