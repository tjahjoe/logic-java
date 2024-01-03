package logicjava;
import java.util.Scanner;

public class pencarianFleksibel {
    static String nama[] = { "bakso", "mie ayam", "pangsit", "martabak" };
    static int tampung[][] = new int[1][];
    static int tambah[][] = new int[1][1];
    static int penambah = 0;
    static int ambilAngka[] = new int[4];
    static String intKeStr = "";
    static Scanner sc = new Scanner(System.in);
    static String pilih = "";

    public static void main(String[] args) {
        pilih = sc.nextLine();
        pencarianKedua();
    }

    static void pencarianWala() {
        penambah = 0;
        tampung[0] = null;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].contains(pilih) || pilih.equals(intKeStr = String.valueOf(i + 1))) {
                tampung[0] = new int[penambah + 1];
                for (int j = 0; j < tampung[0].length; j++) {
                    tampung[0][j] = tambah[0][j];
                }
                tampung[0][penambah] = i;
                penambah++;
                tambah[0] = new int[penambah + 1];
                for (int j = 0; j < tampung[0].length; j++) {
                    tambah[0][j] = tampung[0][j];
                }
            }
        }
    }

    static void pencarianKedua() {
        pencarianWala();
        if (tampung[0] != null) {
            if (tampung[0].length == 1 && pilih.equals(nama[tampung[0][0]])) {
                System.out.println(nama[tampung[0][0]]);
            } else {
                for (int i = 0; i < tampung[0].length; i++) {
                    System.out.println(nama[tampung[0][i]]);
                }
                pilih = sc.nextLine();
                for (int i = 0; i < tampung[0].length; i++) {
                    if (pilih.equals(nama[tampung[0][i]]) || pilih.equals(intKeStr = String.valueOf(i + 1))) {
                        ambilAngka[1] = i;
                    }
                }
                if (pilih.equals(nama[tampung[0][ambilAngka[1]]])
                        || pilih.equals(intKeStr = String.valueOf(ambilAngka[1] + 1))) {
                    for (int i = 0; i < nama.length; i++) {
                        if (nama[i].equals(nama[tampung[0][ambilAngka[1]]])
                                || pilih.equals(intKeStr = String.valueOf(i + 1))) {
                            ambilAngka[2] = i;
                        }
                    }
                    if (nama[ambilAngka[2]].equals(nama[tampung[0][ambilAngka[1]]])) {
                        System.out.println(nama[ambilAngka[2]]);
                    }
                } else {
                    for (int i = 0; i < nama.length; i++) {
                        if (pilih.equals(intKeStr = String.valueOf(i + 1))) {
                            ambilAngka[3] = i;
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
