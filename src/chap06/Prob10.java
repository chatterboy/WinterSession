package chap06;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob10 {
    public static void main(String [] args) {
        String query = "name=kitae&score=a&course=cpp&hobby=sleep";
        String [] tokens = query.split("&");
        for (String token : tokens) {
            String [] kv = token.split("=");
            System.out.println(kv[0] + "\t" + kv[1]);
        }
    }
}
