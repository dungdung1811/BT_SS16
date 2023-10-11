package bt.bt5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bt5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        String str;
        String [] arrString;
        List<String> word = new ArrayList<>();
        int max = 0;
        while ((str = bufferedReader.readLine())!= null ){
            arrString = str.split(" ");
            for (String s: arrString) {
                word.add(s);
                if (max < s.length()){
                    max = s.length();
                }
            }

        }
        for (String maxlenght:word) {
            if (maxlenght.length() == max){
                System.out.println("các tư dài nhất " +maxlenght);
            }
        }


    }
}
