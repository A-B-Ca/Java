package octoberClass;

public class ScotiaBank extends Bank{
    ScotiaBank(){
        roi=8;
    }

    @Override
    double rate() {
        return roi;
    }



}
