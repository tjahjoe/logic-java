package logicjava;

import java.util.*;

public class grafik2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<>(List.of(5, 1, 3, 2, 4, 5, 2, 12));
        int min = Collections.min(angka);
        int max = Collections.max(angka);
        char grafik[][] = new char[angka.size()][max - min + 1];
        char tampung = ' ';
        int a = 0;
        for (int i = 0; i < angka.size(); i++) {
            a = 0;
            for (int j = min; j <= max; j++) {
                if (j <= angka.get(i)) {
                    tampung = '■';
                } else {
                    if (i != 0) {
                        if (j <= angka.get(i - 1) && i != 0) {
                            tampung = '|';
                        } else {
                            tampung = ' ';
                        }
                    } else {
                        tampung = ' ';
                    }

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
