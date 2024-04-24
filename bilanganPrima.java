// package logicjava;

import java.util.Scanner;

public class bilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kondisi = true;
        int angka = input.nextInt();
        if (angka <= 1) {
            kondisi = false;
        } else {
            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    kondisi = false;
                    break;
                }
            }
        }
        if (kondisi) {
            System.out.println("bilangan prima");
        } else {
            System.out.println("bukan bilangan prima");
        }

    }
}
