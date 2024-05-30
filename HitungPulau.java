package SOAL;
import java.util.Scanner;

public class HitungPulau {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            char matrik[][] = new char[4][5];
            for(int i = 0; i<4; i++){
                for(int j = 0; j<5; j++){
                    matrik[i][j] = sc.next().charAt(0);
                }
            }
            hitungPulau(matrik);
        }
        public static int hitungPulau(char matrik[][]){
            int counter = 0;
            for(int i = 0; i < matrik.length; i++){
                for(int j = 0; j<matrik[0].length;j++){
                    if(matrik[i][j] == '1'){
                        hapusPulau(matrik, i ,j);
                        counter++;
                    }
                }
            }
            System.out.println(counter);
            return counter;
        }

        public static void hapusPulau(char[][]matrik, int i ,int j){
            if(i < 0 || j < 0 || i == matrik.length || j == matrik[0].length || matrik[i][j] == '0' ){
                return;
            }
            matrik[i][j] = '0';
            hapusPulau(matrik, i - 1 , j);
            hapusPulau(matrik, i + 1 , j);
            hapusPulau(matrik, i , j + 1);
            hapusPulau(matrik, i , j - 1);
        }
    }

