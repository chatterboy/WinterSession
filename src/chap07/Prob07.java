package chap07;

import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob07 {
    static Vector<String> hashTovector(HashMap<String, String> hsh) {
        Vector<String> ret = new Vector<String>();
        Set<String> set = hsh.keySet();
        for (String key : set) {
            String value = hsh.get(key);
            ret.add(value);
        }
        return ret;
    }
    public static void main(String [] args) {
        HashMap<String, String> hsh = new HashMap<String, String>();
        hsh.put("범죄", "112");
        hsh.put("화재", "119");
        hsh.put("전화번호", "114");
        Vector<String> v = hashTovector(hsh);
        for (int i = 0; i < v.size(); ++i) {
            System.out.println(v.get(i));
        }
    }
}
