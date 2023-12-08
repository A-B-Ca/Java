package HeadFirst;

import java.util.Objects;

public class SongsV2 implements Comparable<SongsV2> {
    String title;
    int bpm;
    String artist;

  /*  @Override
    public boolean equals(Object o) {
    SongsV2 ss= (SongsV2) o;
    return title.equals(ss.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }*/

    @Override
    public String toString() {
        return "SongsV2{" +
                "title='" + title + '\'' +
                ", bpm=" + bpm +
                ", artist='" + artist + '\'' +
                '}';
    }

    @Override
    public int compareTo(SongsV2 o) {
        return title.compareTo(o.getTitle());
    }


    SongsV2(String title, int bpm, String artist){
        this.title=title;
        this.artist=artist;
        this.bpm=bpm;
    }

    public String getTitle() {
        return title;
    }

    public int getBpm() {
        return bpm;
    }

    public String getArtist() {
        return artist;
    }


}
