// package logicjava;
import java.util.Scanner;

public class biner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int tampung[] = new int[4];
        tampung[2] = 1;
        int pangkat = 0;
        String biner[] = new String[2];
        biner[0] = "";
        while (true) {
            tampung[2] = (int) Math.pow(2, pangkat);
            tampung[1] += tampung[2];
            if (tampung[1] >= angka) {
                break;
            } else {
                pangkat++;
            }
        }
        for (int i = pangkat; i >= 0; i--) {
            if (Math.pow(2, i) <= angka) {
                biner[0] += "1";
                angka -= Math.pow(2, i);
            }else{
                biner[0] += "0" ;
            }
        }
        System.out.println(biner[0]);
    }
}
