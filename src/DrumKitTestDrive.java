public class DrumKitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.playsnare();
        d.snare=false;
        if(d.snare==true){
            d.playsnare();
        }
        d.playTopHat();
        double x=5.2552;
        int y=(int)x;


    }
}
