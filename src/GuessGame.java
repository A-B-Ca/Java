public class GuessGame {
    PlayerGame p1;
    PlayerGame p2;
    PlayerGame p3;
    public void startGame(){
        p1= new PlayerGame();
        p2= new PlayerGame();
        p3= new PlayerGame();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isR=false;
        boolean p2isR=false;
        boolean p3isR=false;

        int tn = (int) (Math.random()*10);
        System.out.println("Im thinking about a number between 0 and 9.");
        System.out.println("Give your answers.");

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1=p1.number;
            System.out.println("Player one guessed :"+guessp1);
            guessp2=p2.number;
            System.out.println("Player two guessed :"+guessp2);
            guessp3=p3.number;
            System.out.println("Player three guessed :"+guessp3);

            System.out.println("Correct answer is :"+ tn);


        if(guessp1==tn){
            p1isR=true;
        }
        if(guessp2==tn){
            p2isR=true;
        }
        if(guessp3==tn){
            p3isR=true;
        }
        if(p1isR) {
            System.out.println("We have a winner");
            System.out.println("Player one got it right");
        }
        if(p2isR){
            System.out.println("We have a winner");
            System.out.println("Player two got it right");

        }
        if(p3isR){
            System.out.println("We have a winner");
            System.out.println("Player three got it right");

        }
        if(p1isR || p2isR || p3isR == true){
            System.out.println("Congratulation to the winners");
        }
        else{
            System.out.println("Players will have to try again");
        }

    }

}
