public class GameLauncher {
    public static void main(String[] args){
        GuessGame GG= new GuessGame();
        GG.startGame();
        int w=20;
        int e=21;
        java.lang.String result = (w>e) ? "Great":"flop";
        System.out.println(result);


    }
}


