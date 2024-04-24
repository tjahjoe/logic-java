// package LatihanUTSSem2;

public class Searching {
    Mahasiswa binarySearch(Mahasiswa[] data, String cari, int l, int r){
        int mid = (l + r) / 2;
        if (cari.equalsIgnoreCase(data[mid].nama)) {
            return data[mid];
        } else if (l > r) {
            System.out.println("inpo");
            return null;
        } else {
            if (cari.compareToIgnoreCase(data[mid].nama) < 0) {
              return binarySearch(data, cari, l, mid - 1);
            } else {
              return binarySearch(data, cari, mid + 1, r);
            }
        }
    }

    int seqSearch(Mahasiswa[] data, String cari, int i, int l){
        if (i == l) {
            return -1;
        } else if (cari.equalsIgnoreCase(data[i].nama)) {
            return i;
        } else {
            return seqSearch(data, cari, i + 1, l);
        }
    }
}
