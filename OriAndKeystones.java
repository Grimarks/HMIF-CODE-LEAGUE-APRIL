package SOAL;

import java.util.Scanner;

// * -| Kelas Point digunakan untuk mempermudah pemahaman algoritma |--------
class Point {
    int x = 0;
    int y = 0;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class OriAndKeystones {

    // ? -| STANDARD INPUT |--------------------------
    // ? -| Ubah bagian ini untuk bermain dengan input
    // ! -| Pastikan STDIN memiliki 10 input integer
    static String STDIN = "10 8 13 5 7 20 5 16 12 18";

    // * -| SOLUTION |--------------------------------
    static double min = Long.MAX_VALUE;
    static void findMinDist(Point[] points, Point[] permutation, int iteration) {

        if (points.length == 0) {
            double totalDist = distFinder(permutation);
            // * -| Uncomment untuk melihat segala permutasi |---------------
            // for (Point x: permutation) {
            //     System.out.print("(" + x.x + "," + x.y + ") ");
            // }
            // System.out.println(totalDist);
            if (totalDist < min) {
                min = totalDist;
                // * -| Uncomment untuk melihat semua permutasi terbaik |----
                // for (Point x: permutation) {
                //     System.out.print("(" + x.x + "," + x.y + ") ");
                // }
                // System.out.println(totalDist);
            };
            return;
        }

        for (int i=0; i<points.length; i++) {

            permutation[iteration] = points[i];

            Point[] newP = new Point[points.length-1];
            for (int j=0, pointer=0; j<points.length-1; pointer++) {
                if (pointer == i) continue;
                newP[j] = points[pointer];
                j++;
            }

            findMinDist(newP, permutation, iteration+1);
        }
    }

    static double distFinder(Point[] points) {

        double totalDist = 0;
        int length = points.length;

        for (int i=0; i<length; i++) {
            double rise = points[i%length].y - points[(i+1)%length].y;
            double run = points[i%length].x - points[(i+1)%length].x;
            totalDist += Math.sqrt(rise*rise + run*run);
        }
        return totalDist;
    }

    // * -| MAIN |------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point[] points = new Point[5];
        Point[] temp = new Point[5];

        for (int i=0; i<5; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Point(x, y);
        }

        findMinDist(points, temp, 0);
        System.out.println(min);

        sc.close();
    }
}

