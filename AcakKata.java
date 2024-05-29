package SOAL;

import java.util.Scanner;

public class AcakKata {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        int row = 0;
        int direction = -1;

        for (char c : s.toCharArray()) {
            sb[row].append(c);
            if (row == 0 || row == numRows - 1) direction *= -1;
            row += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder rowString : sb) {
            result.append(rowString);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //input kata
        String input = s.nextLine();

        //input baris
        int numRows = s.nextInt();
        if (numRows < input.length()) {
            System.out.println("Hasil zigzag: " + convert(input, numRows));
        }

        s.close();
    }
}
