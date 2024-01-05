package logicjava;

import java.util.Scanner;

public class pencarianFleksibel {
    static String nama[] = { "bakso", "mie ayam", "pangsit", "martabak" };
    static int tampung[] = new int[0];
    static int tambah[] = new int[1];
    static int penambah = 0;
    static int ambilAngka[] = new int[4];
    static String intKeStr = "";
    static Scanner sc = new Scanner(System.in);
    static String pilih = "";

    public static void main(String[] args) {
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
        pilih = sc.nextLine();
        pencarianKedua();
    }

    static void pencarianAwal() {
        penambah = 0;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].contains(pilih) || pilih.equals(intKeStr = String.valueOf(i + 1))) {
                tampung = new int[penambah + 1];
                for (int j = 0; j < tampung.length; j++) {
                    tampung[j] = tambah[j];
                }
                tampung[penambah] = i;
                penambah++;
                tambah = new int[penambah + 1];
                for (int j = 0; j < tampung.length; j++) {
                    tambah[j] = tampung[j];
                }
            }
        }
    }

    static void pencarianKedua() {
        pencarianAwal();
        if (tampung.length != 0) {
            if (tampung.length == 1 || pilih.equals(nama[tampung[0]])
                    || pilih.equals(intKeStr = String.valueOf(tampung[0] + 1))) {
                System.out.println(nama[tampung[0]]);
            } else {
                for (int i = 0; i < tampung.length; i++) {
                    System.out.println(nama[tampung[i]]);
                }
                pilih = sc.nextLine();
                for (int i = 0; i < tampung.length; i++) {
                    if (pilih.equals(nama[tampung[i]]) || pilih.equals(intKeStr = String.valueOf(i + 1))) {
                        ambilAngka[1] = i;
                        break;
                    }
                }
                if (pilih.equals(nama[tampung[ambilAngka[1]]])
                        || pilih.equals(intKeStr = String.valueOf(ambilAngka[1] + 1))) {
                    for (int i = 0; i < nama.length; i++) {
                        if (nama[i].equals(nama[tampung[ambilAngka[1]]])
                                || pilih.equals(intKeStr = String.valueOf(i + 1))) {
                            ambilAngka[2] = i;
                            break;
                        }
                    }
                    if (nama[ambilAngka[2]].equals(nama[tampung[ambilAngka[1]]])) {
                        System.out.println(nama[ambilAngka[2]]);
                    }
                } else {
                    for (int i = 0; i < nama.length; i++) {
                        if (pilih.equals(intKeStr = String.valueOf(i + 1))) {
                            ambilAngka[3] = i;
                            break;
                        }
                    }
                    if (pilih.equals(intKeStr = String.valueOf(ambilAngka[3] + 1))) {
                        System.out.println("barang tidak tersedia");
                    } else {
                        pencarianKedua();
                    }
                }
            }
        } else {
            System.out.println("barang tidak tersedia");
        }
    }
}
