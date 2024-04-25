package latihanUTSsem22;

import java.util.Scanner;

public class DataMahasiswa {
    private Mahasiswa[] data = null;
    private int indeks;

    DataMahasiswa(int jumlah) {
        this.data = new Mahasiswa[jumlah];
        indeks = -1;
    }

    void inputMahasiswa(Scanner sc29) {
        if (indeks < data.length - 1) {
            System.out.print("nisn\t:");
            String nisn = sc29.nextLine();
            System.out.print("nama\t:");
            String nama = sc29.nextLine();
            System.out.print("alamat\t:");
            String alamat = sc29.nextLine();
            System.out.print("tahun\t:");
            int tahun = sc29.nextInt();
            System.out.print("nilai\t:");
            double nilai = sc29.nextDouble();
            sc29.nextLine();
            tambahMahasiswa(new Mahasiswa(nisn, nama, alamat, tahun, nilai));
        } else {
            System.out.println("!!kolom sudah penuh!!");
        }

    }

    private void tambahMahasiswa(Mahasiswa mhs) {
        indeks++;
        data[indeks] = mhs;
    }

    void tampilMahasiswa(Scanner sc29) {
        if (data != null) {
            selectionSort();
            for (int i = 0; i <= indeks; i++) {
                System.out.println(this.data[i].nama);
            }
            tampilData(sc29);
        } else {
            System.out.println("data tidak ada");
        }
    }

    private void selectionSort() {
        for (int i = 1; i <= indeks; i++) {
            Mahasiswa temp = this.data[i];
            int j = i;
            while (j > 0 && temp.nama.compareToIgnoreCase(this.data[j - 1].nama) < 0) {
                this.data[j] = this.data[j - 1];
                j--;
            }
            this.data[j] = temp;
        }
    }

    private int binarySearch(String nama, int l, int r) {
        int mid = (l + r) / 2;
        if (nama.equalsIgnoreCase(this.data[mid].nama)) {
            return mid;
        } else if (l > r) {
            return -1;
        } else {
            if (nama.compareToIgnoreCase(this.data[mid].nama) < 0) {
                return binarySearch(nama, l, r - 1);
            } else {
                return binarySearch(nama, l + 1, r);
            }
        }
    }

    private void tampilData(Scanner sc29) {
        System.out.print("Masukkan nama mahasiswa : ");
        int i = binarySearch(sc29.nextLine(), 0, indeks);
        if (i != -1) {
            System.out.println("nisn\t: " + this.data[i].nisn);
            System.out.println("nama\t: " + this.data[i].nama);
            System.out.println("alamat\t: " + this.data[i].alamat);
            System.out.println("tahun\t: " + this.data[i].tahun);
            System.out.println("nilai\t: " + this.data[i].nilai);
        } else {
            System.out.println("mahasiswa tidak terdaftar");
        }
    }
}
