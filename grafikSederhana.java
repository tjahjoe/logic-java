// package logicjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class grafikSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<>(List.of(5, 1, 3,2, 4, 5, 2, 2));
        int min = Collections.min(angka);
        int max = Collections.max(angka);
        char grafik[][] = new char[angka.size()][max - min + 1];
        char tampung;
        int a = 0;
        for (int i = 0; i < angka.size(); i++) {
            a = 0;
            for (int j = min; j <= max; j++) {
                if (j == angka.get(i)) {
                    tampung = '*';
                } else {
                    tampung = ' ';
                }
                grafik[i][a] = tampung;
                a++;
            }
        }
        a = 0;
        for (int i = grafik[0].length - 1; i >= 0; i--, a++) {

            for (int j = 0; j < grafik.length; j++) {
                System.out.print(grafik[j][i] + " ");
            }
            System.out.println("  " + (max - a));
            if (i == 0) {
                for (int j = 0; j < grafik.length; j++) {
                    System.out.print(j + 1 + " ");
                }
            }
        }
    }

}
// perlu dikembangkan lagi
