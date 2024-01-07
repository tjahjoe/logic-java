package logicjava;

public class hitungRupiah {
    public static void main(String[] args) {
        double rupiah[] = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };
        double jumlah = 0;
        double uang = 2090;
        int i = 0;
        while (jumlah < uang) {
            if (i == rupiah.length) {
                break;
            } else {
                if (jumlah + rupiah[i] <= uang) {
                    jumlah += rupiah[i];
                    System.out.println(jumlah);
                } else {
                    i++;
                }
            }
        }
    }
}
