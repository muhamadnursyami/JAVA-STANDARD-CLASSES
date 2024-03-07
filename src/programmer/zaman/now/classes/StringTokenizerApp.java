package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String value = "Muhamad Nur SyAMI";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");
//       cara bacanya, di akan di potong jika tokenya masih ada return true, jika tidak maka kondisi false
//      Potongnya dikit dikit, dia lazy berbeda dengan split yang mengonsumsi memori lebih banyak
        while(tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken(); // cara ambil resultnya sepeti ini
            System.out.println(result);
        }
    }
}
