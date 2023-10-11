package bt.bt3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bt3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> words = new ArrayList<>(); // Khởi tạo danh sách để lưu trữ các từ
        List<String> listDublecate = new ArrayList<>();   // Khởi tạo danh sách để lưu trữ các từ trùng lặp
        String str; // Biến str để lưu từng dòng đọc từ tệp
        String [] exitted;// Mảng exitted để lưu trữ từng từ trong dòng
        while ((str = bufferedReader.readLine()) != null){
            exitted = str.split(" ");// Tách dòng thành các từ bằng dấu cách
            // Lặp qua từng từ trong dòng
            for (String arrWord: exitted) {
                // Kiểm tra xem từ đã có trong danh sách từ chưa và không thuộc danh sách từ trùng lặp
                if(words.contains(arrWord)&&!listDublecate.contains(arrWord)){
                    // Nếu đã có trong danh sách từ và chưa trong danh sách từ trùng lặp, thì thêm vào danh sách từ trùng lặp
                    listDublecate.add(arrWord);
                }else {
                    // Nếu chưa có trong danh sách từ, thêm vào danh sách từ
                    words.add(arrWord);
                }
            }

        }
        for (String string: listDublecate) {
            System.out.println(string);
        }
        bufferedReader.close();

    }
}
