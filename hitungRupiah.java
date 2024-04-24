// package logicjava;

import java.util.Scanner;

public class hitungRupiah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rupiah[] = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };
        int tampung[] = new int[rupiah.length];
        double jumlah = 0;
        double uang = input.nextDouble();
        int i = 0;
        while (jumlah < uang) {
            if (i == rupiah.length) {
                break;
            } else {
                if (jumlah + rupiah[i] <= uang) {
                    jumlah += rupiah[i];
                    tampung[i]++;
                } else {
                    i++;
                }
            }
        }
        for (int j = 0; j < tampung.length; j++) {
            if (tampung[j] != 0) {
                System.out.println(rupiah[j] + " x " + tampung[j]);
            }
        }
    }
}
