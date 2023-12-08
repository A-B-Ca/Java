package HeadFirst;

import java.util.Comparator;
import java.util.List;

public class SongComp implements Comparator<SongsV2>{

    @Override
    public int compare(SongsV2 o1, SongsV2 o2) {
        if(o1.getBpm()>o2.getBpm()){
            return 1;
        } else if (o1.getBpm()<o2.getBpm()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
