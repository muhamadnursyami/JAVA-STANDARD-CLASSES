package programmer.zaman.now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner("," ,"{" ,"}");
//        Menambahkan tulisan di joiner
        joiner.add("Muhamad");
        joiner.add("Nur");
        joiner.add("Syami");

//        Setelah di add kalimat nya ke dalam variabel joiner
//        maka kita akan konversikan dia menjadi string
        String values = joiner.toString();
        System.out.println(values);


    }
}
