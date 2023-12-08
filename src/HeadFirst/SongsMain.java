package HeadFirst;

import java.util.*;

public class SongsMain {
    public static void main(String[] args) {
        /*Songs s1= new Songs();
        List<String> songList=s1.getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);*/


        //List<SongsV2> songsV2List = new ArrayList<>();
        Set<SongsV2> songsV2List= new TreeSet<>((one,two)->one.getBpm()-two.getBpm());
        songsV2List.add(new SongsV2("Hosanna",100,"A R Rahman"));
        songsV2List.add(new SongsV2("Kangal Irandal",101,"Harris Jayaraj"));
        songsV2List.add(new SongsV2("Darshana",115,"Hisham Abdul Wahab"));
        songsV2List.add(new SongsV2("Arabic Kuthu",150,"Anirudh"));
        songsV2List.add(new SongsV2("Kangal Irandal",101,"Harris Jayaraj"));
        songsV2List.add(new SongsV2("Anuragini itha en",90,"Johnson"));
        songsV2List.add(new SongsV2("Anuragini itha e",90,"Ashan"));
        songsV2List.add(new SongsV2("Devanganagal",95,"Johnson"));
        System.out.println(songsV2List);

        /*Collections.sort(songsV2List);
        System.out.println(songsV2List);
        songsV2List.sort((one,two)->one.getArtist().compareTo(two.getArtist()));
        System.out.println(songsV2List);
        songsV2List.sort((one,two)->one.bpm-two.getBpm());
        System.out.println(songsV2List);*/
        /*SongComp sc= new SongComp();
        songsV2List.sort(sc);
        System.out.println(songsV2List);*/
    }
}
