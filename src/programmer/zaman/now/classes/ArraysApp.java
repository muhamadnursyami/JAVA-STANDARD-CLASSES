package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,4,234,5,619,52,7,82,9
        };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        mencari index pada nomor yang telah di tentukan, kalo nomornya salah maka hasilnnay negatif
        System.out.println(Arrays.binarySearch(numbers,7));
        System.out.println(Arrays.binarySearch(numbers,9));
        System.out.println(Arrays.binarySearch(numbers,14));

//        Mengkopy data array sebanyak jumlah yang di tentukan
        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result));

    }
}
