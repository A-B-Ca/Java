package octoberClass;

public class RBC extends Bank{
    RBC(){
        this.roi=9.5;
    }

    @Override
    double rate() {
        return roi;
    }
}
