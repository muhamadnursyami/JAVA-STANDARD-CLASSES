package programmer.zaman.now.classes;

import java.nio.Buffer;

public class StringBuilderApp {
    public static void main(String[] args) {
//        Manfaat menggunakan String Builder adalah
//        ketika kita ingin menambahkan seuatu kalimat didalam sebuah
//        variabel maka kita tidak perlu menghabiskan memori lebih banyak
//        ketimbang menggunakan String, karena ketika menggunakan string
//        jika terjadi perubahan, String akan membuat memori baru bukan
//        memori yang sama itu diubah.
//        Sedangkan StringBuilder itu mengubah memori yang sama
        StringBuilder builder = new StringBuilder();
//  Masukan karakter yang ingin dibuat kedalam variabel builder
        builder.append("Muhamad");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Syami");

// Setelah di append kemudian kita konversikan kalimat yang udah ada di append itu
//        menjadi string
        String name = builder.toString();
        System.out.println(name);


    }
}
