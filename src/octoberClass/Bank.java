package octoberClass;

public class Bank {
    double roi;
    double deprate;
    double rate(){
        return roi;
    }
    double depRate(){
        deprate= roi-2;
        return deprate;
    }
}
