package SOAL;

import java.util.HashMap;
import java.util.Scanner;

public class MerkTerbanyak {
    static String kendaraanMelintas(int n, String[] array) {
        // inisiasi variabel
        HashMap<String, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        String merkTerbanyak = "";

        // Menghitung jumlah setiap string dalam array
        for (String str : array) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Mencari jumlah merk yang paling banyak terlihat
        for (String m : array) {
            int count = countMap.getOrDefault(m, 0);
            if (count > maxCount) {
                maxCount = count;
                merkTerbanyak = m;
            }
        }
        return merkTerbanyak;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Jumlah kendaraan yang ada di dalam list: ");
        int n = s.nextInt();
        s.nextLine();

        System.out.println("Merk kendaraan yang ada: ");
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextLine();
        }

        String hasil = kendaraanMelintas(n, array);
        System.out.println("Merk kendaraan yang paling banyak terlihat adalah merk " + hasil);
    }
}
