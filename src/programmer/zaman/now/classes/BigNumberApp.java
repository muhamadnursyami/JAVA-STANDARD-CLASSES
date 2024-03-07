package programmer.zaman.now.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
//    Menginisialisasi sebuah number yang melebih kapasitas long menggunakan class Big Integer
//        yang valuenya itu string
        BigInteger a = new BigInteger("100000000000000000000000000");
        BigInteger b = new BigInteger("100000000000000000000000000");
//        Cara menambahkanya menggunakan method add
        BigInteger c = a.add(b);
        System.out.println(c);
    }
}
