public class PlayerGame {
    int number;
    public int guess(){
        number=(int) (Math.random()*10);
        return number;
    }
}
