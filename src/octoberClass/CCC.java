package octoberClass;

public class CCC {
    int x;
    String s;

    public CCC(int x, String s) {
        this.x = x;
        this.s = s;
    }

    @Override
    public String toString() {
        return x+s;
    }
}
