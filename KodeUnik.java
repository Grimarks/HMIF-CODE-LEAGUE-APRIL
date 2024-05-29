package SOAL;

import java.util.Scanner;

public class KodeUnik {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int output;
        String input;

        System.out.println("input kata kata");
        input = scan.nextLine();

        //Dikurangin satu biar seru saat di kasih clue hehehe
        for(int i= 0; i < input.length(); i++){
           output = input.charAt(i);
            System.out.print(output-1 + " ");
        }

    }
}
