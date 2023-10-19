package octoberClass;

public class BankMain {
    public static void main(String[] args) {
        Bank sb= new ScotiaBank();
        System.out.println("Loan Rate: "+sb.rate());
        System.out.println("Dep rate: "+sb.depRate());

        Bank rbc= new RBC();
        System.out.println("Loan Rate: "+rbc.rate());
        System.out.println("Dep rate: "+rbc.depRate());

        Bank td= new TDBank();
        System.out.println("Loan Rate: "+td.rate());
        System.out.println("Dep rate: "+td.depRate());
    }
}
