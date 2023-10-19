package octoberClass;

public class MainMediaPlayer {
    public static void main(String[] args) {


        MediaPlayer vlc = new VLC();
        MediaPlayer win = new WindowsMP();
        vlc.play();
        win.play();
        win.speedup();
        vlc.speedup();
    }
}
