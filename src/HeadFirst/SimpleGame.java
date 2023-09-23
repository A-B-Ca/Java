package HeadFirst;
import java.util.*;
public class SimpleGame {

    public static void main(String[] args){
        ArrayList<Integer> loc= new ArrayList<Integer>();

        int y=0;
        int s = (int) (Math.random()*10);
        loc.add(s);
        for(y=1;y<3;y++){
            loc.add(s+1);
            s=s+1;

        }
        /*while(y<3) {
            boolean flag=false;
            int s = (int) (Math.random()*10);
            for(int d=0;d<=y;d++){
                if(loc[d]==s){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                loc[y]=s;
                y++;
            }

        }*/
        //for(int w=0;w<3;w++) {
            //System.out.println(loc);
        //}
        int i=0;
        String ans="miss";
        do {
            System.out.println("Enter Your Guess");
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();
            Game g1 = new Game();
            g1.setLocation(loc);

            ans = g1.check(guess);
            System.out.println(ans);
            i++;

        }
        while(ans!="kill");
        System.out.println("You took "+i+ " guesses");


    }

}
