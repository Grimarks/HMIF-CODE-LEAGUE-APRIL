package SOAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PolaRahasia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Membaca input N
        int N = s.nextInt();
        System.out.println();

        // Membaca N buah bilangan
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = s.nextInt();
            if (num % 2 != 0 && num < 100) {
                numbers.add(num);
            }
        }

        // Mengurutkan bilangan
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 != o2 % 10) {
                    return Integer.compare(o2 % 10, o1 % 10);
                }
                return Integer.compare(o2, o1);
            }
        });

        // Mencetak hasil pengurutan
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        s.close();
    }
}
