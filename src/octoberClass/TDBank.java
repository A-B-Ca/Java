package octoberClass;

public class TDBank extends Bank{
    TDBank(){
        this.roi=9;
    }
    @Override
    double rate() {
        return roi;
    }
}
