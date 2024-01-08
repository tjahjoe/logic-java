package logicjava;

import java.util.Scanner;

public class prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kondisi = true;
        int angka = input.nextInt();
        for (int i = 2; i <= angka; i++) {
            if (i == 2) {
                System.out.println(i);
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        kondisi = false;
                        break;
                    } else {
                        kondisi = true;
                    }
                }
                if (kondisi) {
                    System.out.println(i);
                }
            }
        }
    }
}
