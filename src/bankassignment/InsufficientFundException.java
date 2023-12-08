package bankassignment;

public class InsufficientFundException extends Exception{
    InsufficientFundException(String name){

        super(name);
        System.out.println(name+"Here");
    }
}
