// package LatihanUTSSem2;

import java.util.Scanner;

public class MethodMahasiswa {
    Mahasiswa[] data = null;
    int top;

    void inputMahasiswa(Scanner sc) {
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Jurusan : ");
        String jurusan = sc.nextLine();
        tambahMahasiswa(new Mahasiswa(nama, nim, jurusan));
    }

    void tambahMahasiswa(Mahasiswa data) {
        top++;
        Mahasiswa[] temp = new Mahasiswa[top];
        if (this.data != null) {
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = this.data[i];
            }
        }
        temp[top - 1] = data;
        this.data = temp;
    }

    private Mahasiswa nextKurangMahasiswa() {
        if (data != null && top - 1 > 0) {
            top--;
            Mahasiswa[] temps = new Mahasiswa[top];
            for (int i = 0; i < top; i++) {
                temps[i] = data[i];
            }
            Mahasiswa temp = data[top];
            data = temps;
            return temp;
        } else if (top == 1) {
            top--;
            Mahasiswa temp = data[top];
            data = null;
            return temp;
        }
        return null;
    }

    String kurangMahasiswa() {
        Mahasiswa cek = nextKurangMahasiswa();
        return (cek == null) ? "Tidak ada mahasiswa" : cek.nama;
    }

    void tampilMahasiswaPalingAtas() {
        if (data != null)
            System.out.println(data[top - 1].nama);
    }

    void tampilMahasiswa() {
        if (data != null) {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println(data[i].nama);
            }
        } else {
            System.out.println("data tidak tersedia");
        }
    }

    void cariMahasiswaBinary(String cari){
        MargeSort sorting = new MargeSort();
        Searching binary = new Searching();
        Mahasiswa o = binary.binarySearch(sorting.margeSort(data), cari, 0, top - 1);
        System.out.println((o != null) ? o.nama + " ada" : "Tidak ditemukan");
    }

    void cariMahasiswaSeq(String cari){
        Searching seq = new Searching();
        int indeks = seq.seqSearch(data, cari, 0, top);
        System.out.println((indeks != -1) ? "Mahasiswa ada di indeks ke-" + indeks : "Tidak ditemukan");
    }
}
