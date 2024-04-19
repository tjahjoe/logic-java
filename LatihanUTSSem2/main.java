package LatihanUTSSem2;

public class main {
    public static void main(String[] args) {
       MethodMahasiswa mahasiswa = new MethodMahasiswa();
       Mahasiswa data1 = new Mahasiswa("Wahyu Rizky Cahyana", "2341720006", "Teknologi Informasi");
       
       mahasiswa.tambahMahasiswa(data1);
    //    System.out.println(mahasiswa.kurangMahasiswa());
    //    System.out.println(mahasiswa.kurangMahasiswa());
       System.out.println(mahasiswa.nextKurangMahasiswa());
      //  mahasiswa.tampilMahasiswa();
    //    mahasiswa.tambahMahasiswa(data1);
    //    System.out.println(mahasiswa.kurangMahasiswa());
       
    }
}
