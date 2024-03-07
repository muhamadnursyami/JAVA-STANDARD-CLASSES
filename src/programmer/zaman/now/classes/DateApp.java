package programmer.zaman.now.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);
//Cara menginsialisasi Calender menggunakan getInstance();
        Calendar calendar = Calendar.getInstance();
//        Menambahkan kalender
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY, 1);
//        Mengambil time
        Date result = calendar.getTime();
        System.out.println(result);

    }
}
