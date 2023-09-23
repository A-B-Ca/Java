package HeadFirst;

import java.util.ArrayList;

public class Game {
    ArrayList<Integer> locationCell = new ArrayList<Integer>();
    String result;

    public void setLocation(ArrayList<Integer> loc) {
        locationCell = loc;
    }

    public String check(int guess) {
        result = "miss";
        int index = locationCell.indexOf(guess);
        if (index >= 0) {
            locationCell.remove(index);
            result="hit";
        }
        if (locationCell.isEmpty()) {
            result = "kill";
        }
        return result;
    }
}
