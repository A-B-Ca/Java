public class While {
    public static void main(String[] args){
        int x=1;
        String color="Green";
        while(x<11)
        {
            System.out.println(x + color +" bottle");
            x=x+1;
        }
        if(x==11){
            System.out.println("We are closed for today");
        }

    }
}
