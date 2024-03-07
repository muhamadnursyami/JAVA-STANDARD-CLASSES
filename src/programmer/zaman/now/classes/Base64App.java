package programmer.zaman.now.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Eko Kurniawan Khannedy";
//Mengendoced String original
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);


//        Menbalikan kanlagi yang telah di encoded
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result);
    }
}
