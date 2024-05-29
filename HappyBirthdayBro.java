package SOAL;

import java.util.Scanner;

public class HappyBirthdayBro {
    static int lilinKue(int n, int[] ar) {
        // inisiasi variabel
        int hasil = 0;
        int max = 0;

        // cek satu persatu array ar
        for (int a : ar) {
            if (max < a) { // jika a lebih besar dari max
                max = a; // maka max diganti 1
                hasil = 1; // hasil akan direset
            } else {
                if (max == a) { // jika a = 1
                    hasil++; // hasil akan ditambah
                }
            }
        }
        return hasil;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);

        System.out.println("Jumlah lilin yang ada: ");
        int n = s.nextInt();

        System.out.println("Tinggi lilin:");
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        int hasil = lilinKue(n, ar);

        System.out.println("jumlah yang tertiup= " + hasil);

    }// aman
}
