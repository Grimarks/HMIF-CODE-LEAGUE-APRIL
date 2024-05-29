package SOAL;
import java.util.Arrays;
import java.util.Scanner;

public class BolakBalik {
    public static boolean Anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    /*

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
//        String text1 = "listen";
//        String text2 = "silent";
        if (Anagrams(text1, text2)) {
            System.out.println("True, " + text1 + " dan " + text2 + " adalah anagram.");
        } else {
            System.out.println("False, " + text1 + " dan " + text2 + " bukan anagram.");
        }
    }
}
