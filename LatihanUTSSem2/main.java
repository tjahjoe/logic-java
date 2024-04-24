// package LatihanUTSSem2;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      MethodMahasiswa mahasiswa = new MethodMahasiswa();
      boolean kondisi = true;
      while (kondisi) {
         System.out.println("1. Tambah mahasiswa");
         System.out.println("2. Kurang mahasiswa");
         System.out.println("3. Urutkan mahasiswa");
         System.out.println("4. Tampil mahasiswa");
         System.out.println("5. Cek mahasiswa");
         switch (sc.nextLine()) {
            case "1":
               mahasiswa.inputMahasiswa(sc);
               System.out.print("Ingin lanjut? (y/n) :");
               if (sc.nextLine().equals("n"))
                  kondisi = false;
               break;
            case "2":
               System.out.println("Data yang di hapus : " + mahasiswa.kurangMahasiswa());
               System.out.print("Ingin lanjut? (y/n) :");
               if (sc.nextLine().equals("n"))
                  kondisi = false;
               break;
            case "3":
               MargeSort sort = new MargeSort();
               sort.hasilMargeSort(mahasiswa.data);
               System.out.print("Ingin lanjut? (y/n) :");
               if (sc.nextLine().equals("n"))
                  kondisi = false;
               break;
            case "4":
               mahasiswa.tampilMahasiswa();
               System.out.print("Ingin lanjut? (y/n) :");
               if (sc.nextLine().equals("n"))
                  kondisi = false;
               break;
            case "5":
               pemilihanPencarian(sc, mahasiswa);
               break;
            default:
               System.out.println("tidak valid");
               break;
         }
      }
   }

   static void pemilihanPencarian(Scanner sc, MethodMahasiswa mahasiswa) {
      System.out.println("1. Tanpa tumpukan");
      System.out.println("2. Dengan tumpukan");
      String pilih = sc.nextLine();
      if (pilih.equals("1")) {
         System.out.print("Masukkan Nama : ");
         mahasiswa.cariMahasiswaBinary(sc.nextLine());
      } else if (pilih.equals("2")) {
         System.out.print("Masukkan Nama : ");
         mahasiswa.cariMahasiswaSeq(sc.nextLine());
      } else {
         pemilihanPencarian(sc, mahasiswa);
      }
   }
}
