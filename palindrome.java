// package logicjava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.next();
        char tampung[] = new char[kata.length()];
        boolean kondisi = false;
        for (int i = 0; i < tampung.length; i++) {
            tampung[i] = kata.charAt(i);
        }
        for (int i = 0; i < tampung.length / 2; i++) {
            if (tampung[i] == tampung[(tampung.length - i) - 1]) {
                kondisi = true;
            } else {
                kondisi = false;
                break;
            }
        }
        if (kondisi) {
            System.out.println("palindrome");
        } else {
            System.out.println("bukan palindorome");
        }
    }
}
