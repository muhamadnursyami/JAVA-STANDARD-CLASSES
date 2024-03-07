package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Jikalau kita ingi menginputkan data nya berupa string
        System.out.print("Nama : ");
        String name = scanner.nextLine();
//      Jika ingin  menginputkan nilai berupa number, juga bisa boolean tinggal ganti aja methodnya
        System.out.print("Umur : ");
        Integer age = scanner.nextInt();
//Print jika sudah input data
        System.out.println("Hello" + name + "Umur anda adalah" + age);



    }
}
