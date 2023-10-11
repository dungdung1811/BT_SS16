package bt.bt2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bt2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        List<String> word = new ArrayList<>();
        while (str!= null){
            str = bufferedReader.readLine();
            word.add(str);
        }
        bufferedReader.close();
        System.out.println("số dòng trong mảng là " + word.size());

    }
}
