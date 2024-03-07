package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

//        KOnversi Number ke number
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

//        Konversi string ke integer
        String contoh ="10000";
        String contoh2 ="100.10";
//        Ini balikannya Integer non primitive
//        Kalo Integer itu non primitive
        Integer contohInt = Integer.valueOf(contoh);
//          ini integer primitive, lihat di kata paling depan
//        kalo int itu primitive
        int contohint = Integer.parseInt(contoh);
//        Kalo pakai double untuk menangini contoh 2, untuk contoh2 jika
//        menggunakan Integer maka akan error karena Integer tidak mengerti tanda titik (.)

        Double  contohInt2 = Double.valueOf(contoh2);
        System.out.println(contohInt2);
    }
}
