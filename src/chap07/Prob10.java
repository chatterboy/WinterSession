package chap07;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-29.
 */

class Location {
    double lat;
    double lon;
    Location() {}
    Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    void print() {
        System.out.println("latitude>>" + String.valueOf(lat));
        System.out.println("longitude>>" + String.valueOf(lon));
    }
}

public class Prob10 {
    public static void main(String [] args) {
        HashMap<String, Location> hsh = new HashMap<String, Location>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; ++i) {
            System.out.print("지명>>");
            String name = in.next();
            System.out.print("위도>>");
            double lat = in.nextDouble();
            System.out.print("경도>>");
            double lon = in.nextDouble();
            hsh.put(name, new Location(lat, lon));
        }
        System.out.print("검색할 지명>>");
        String key = in.next();
        hsh.get(key).print();
        in.close();
    }
}
