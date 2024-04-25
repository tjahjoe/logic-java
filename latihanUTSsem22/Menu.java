package latihanUTSsem22;

import java.util.Scanner;

public class Menu {
    static void menu(DataMahasiswa data, Scanner sc29) {
        System.out.println("1. Tambah mahasiswa");
        System.out.println("2. Tampil mahasiswa");
        System.out.println("3. Reset data");
        switch (sc29.nextLine()) {
            case "1":
                data.inputMahasiswa(sc29);
                menu(data, sc29);
                break;
            case "2":
                data.tampilMahasiswa(sc29);
                break;
            case "3":
                resetData(sc29);
                break;
            default:
                break;
        }
    }

    static void jumlahKolom() {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Masukkan jumlah kolom : ");
        int jum = sc29.nextInt();
        sc29.nextLine();
        menu(new DataMahasiswa(jum), sc29);
    }

    static void resetData(Scanner sc29) {
        System.out.println("Apakah anda yakin untuk me-reset");
        char pilih = sc29.nextLine().charAt(0);
        if (pilih == 'y') {
            jumlahKolom();
        }
    }
}
