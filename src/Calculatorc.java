public class Calculatorc {
    public static void main(String[] args) {


    int x=25;
    int y=5;
    char input='*';
    if(input == '+'){
       System.out.println(x+y);
    }
    else if(input=='-'){
        System.out.println(x-y);
    }
    else if(input=='/'){
        System.out.println(x/y);
    }
    else if (input=='*'){
        System.out.println(x*y);
        }
    else if(input=='%'){
        System.out.println(x%y);
    }
    else{
        System.out.println("Wrong operator");
    }    }

}


