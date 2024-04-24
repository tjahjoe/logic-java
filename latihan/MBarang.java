package latihan;

import java.util.Scanner;

public class MBarang {
    Barang[] data = null;
    int indeks;

    MBarang(int jumlah) {
        data = new Barang[jumlah];
        indeks = -1;
    }

    void menambahBarang(Barang newBarang) {
        if (indeks < data.length - 1) {
            indeks++;
            data[indeks] = newBarang;
            System.out.println("Barang berhasil ditambahkan");
        } else {
            System.out.println("Sudah penuh");
        }
    }

    void mengurangiBarang(String id) {
        if (indeks > 0) {
            int temp = indeks;
            for (int i = 0, j = 0; i <= temp; i++) {
                if (!data[i].id.equalsIgnoreCase(id)) {
                    data[j] = data[i];
                    j++;
                } else {
                    indeks--;
                }
            }
        }
    }

    void tampilBarang(){
        for (int i = 0; i <= indeks; i++) {
            System.out.println(data[i].id);
        }
    }

    void menambahStokBarang(Scanner sc){
        if (data != null && this.indeks > -1) {
            System.out.print("Masukkan id barang : ");
            String id =  sc.nextLine();
            int indeks = 0;
            for (int i = 0; i <= this.indeks; i++) {
                if (id.equals(this.data[i].id)) {
                    indeks = i;
                    break;
                }
            }
            if (id.equals(this.data[indeks].id)) {
                System.out.print("tambahkan stok : ");
                this.data[indeks].stok = this.data[indeks].stok + sc.nextInt();
                System.out.println(this.data[indeks].stok);
            }
        }
    }
}