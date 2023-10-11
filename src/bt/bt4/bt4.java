package bt.bt4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bt4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        List<String> allWords = new ArrayList<>();
        String str;
        String[] words;
        while ((str = bufferedReader.readLine()) != null) {
            words = str.split(" ");
            Collections.addAll(allWords, words);
        }
        bufferedReader.close();
        Collections.sort(allWords);
        System.out.println(allWords);
    }
}
