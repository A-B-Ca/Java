package bankassignment;

public class ScotiaBank extends Bank{
    private String accntName;
    private String accntType;
    private long accntNumber;
    private double accntBal;

    ScotiaBank(String name, String type, long numb, double bal){
        accntName= name;
        accntType=type;
        accntNumber=numb;
        accntBal=bal;

    }
    public String getAccntName() {
        return accntName;
    }

    public String getAccntType() {
        return accntType;
    }

    public long getAccntNumber() {
        return accntNumber;
    }



    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }


    public double getAccntBal() {
        return accntBal;
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw");
        double inp2= scan.nextDouble();
        if(inp2>0 && inp2<=accntBal){
            accntBal=accntBal-inp2;
            System.out.println("Withdraw Successful, your current account balance is: "+accntBal);

        }
        else if(inp2>accntBal){
            System.out.println("You have insufficient balance");
        }
        else{
            System.out.println("Enter a valid input");
        }

    }
    public void makeDep(){
        System.out.println("Enter the deposit amount");
        double inp= scan.nextDouble();
        if(inp>0){
            accntBal=accntBal + inp;

            System.out.println("Your new account balance is: $"+accntBal);
        }
        else{
            System.out.println("Enter a valid amount");
        }
    }
}
