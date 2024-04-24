package latihan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MBarang barang = new MBarang(10);
        barang.menambahBarang(new Barang("a", null, 10, 0));
        barang.menambahBarang(new Barang("b", null, 0, 0));
        barang.menambahBarang(new Barang("c", null, 0, 0));
        barang.menambahBarang(new Barang("d", null, 0, 0));
        barang.menambahBarang(new Barang("e", null, 0, 0));
        barang.menambahBarang(new Barang("f", null, 0, 0));
        barang.menambahBarang(new Barang("g", null, 0, 0));
        barang.mengurangiBarang("e");
        barang.menambahStokBarang(sc);
        barang.tampilBarang();
    }
}
