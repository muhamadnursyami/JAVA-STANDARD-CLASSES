package programmer.zaman.now.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Muhamad Nur Syami";

        String  lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Muhamad"));
        System.out.println(name.endsWith("Syami"));

//        Memecahkan kalimat menjadi array paramaternya pakai string spasi " "
        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }
//        Mengambil perkarakter
        System.out.println(name.charAt(0));
    }
}
