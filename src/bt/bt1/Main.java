package bt.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        File fileText = new File("text.txt");
        if (fileText.createNewFile()) {
            System.out.println("tạo file thành công ");
        }
// ghi file
        FileWriter fileWriter = new FileWriter("text.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String[] arr = {"Mục tiêu luyện tâp đọc file dung \n Mục tiêu luyện tâp đọc file dung\n Mục tiêu luyện tâp đọc file dung"};
        for (String str : arr) {
            bufferedWriter.write(str);
        }

        bufferedWriter.close();

        System.out.println("thanh công ghi file");
//đọc file
        int count = 0;
        FileReader reader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
        String[] strings;
        while ((str= bufferedReader.readLine()) != null) {
            strings = str.split(" ");
            count= count+ strings.length;
        }
        System.out.println(count);
        System.out.println("...");

    }
}
