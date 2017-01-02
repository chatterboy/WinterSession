package chap08;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob03 {
    public static void main(String [] args) {
        File file = new File("C:/");
        String [] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });
//        System.out.println(Arrays.toString(directories));
        for (String directory : directories) {
            System.out.println(directory);
        }
    }
}
