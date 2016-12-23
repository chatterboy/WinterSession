package chap04;

import java.util.ArrayList;

/**
 * Created by AIServer on 2016-12-23.
 */
public class Prob1 {
    static class Song {
        String title;
        String artist;
        String album;
        ArrayList<String> composers;
        int year;
        int track;
        Song() {}
        Song(String title, String artist, String album, ArrayList<String> composers, int year, int track) {
            this.title = title;
            this.artist = artist;
            this.album = album;
            this.composers = composers;
            this.year = year;
            this.track = track;
        }
        private void show() {
            System.out.println("title: " + title);
            System.out.println("artist: " + artist);
            System.out.println("album: " + album);
            System.out.print("composers:");
            for (String composer : composers) {
                System.out.print(" " + composer);
            }
            System.out.println();
            System.out.println("year: " + year);
            System.out.println("track: " + track);
        }
    }
    public static void main(String [] args) {
        ArrayList<String> composers = new ArrayList<String>();
        composers.add("베니 안데르손");
        composers.add("비에른 울바에우스");
        composers.add("스틱 앤더슨");
        Song song = new Song("Dancing Queen", "ABBA", "Arrival", composers, 1976, 1);
        song.show();
    }
}
