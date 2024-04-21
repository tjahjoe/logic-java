package LatihanUTSSem2;

public class MargeSort {
    Mahasiswa[] margeSort(Mahasiswa[] data) {
        if (data != null) {
            return marge(data, 0, data.length - 1);
        }
        return null;
    }

    private Mahasiswa[] marge(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return new Mahasiswa[] { arr[l] };
        } else {
            int mid = (l + r) / 2;
            Mahasiswa left[] = marge(arr, l, mid);
            Mahasiswa right[] = marge(arr, mid + 1, r);
            Mahasiswa sort[] = sort(new Mahasiswa[r - l + 1], left, right, r - l + 1, 0, 0, 0);
            return sort;
        }
    }

    private Mahasiswa[] sort(Mahasiswa[] arr, Mahasiswa[] left, Mahasiswa[] right, int length, int l, int r, int i) {
        if (i == length) {
            return arr;
        } else {
            if (l < left.length && r < right.length) {
                if (left[l].nama.compareTo(right[r].nama) < 0) {
                    arr[i] = left[l];
                    return sort(arr, left, right, length, l + 1, r, i + 1);
                } else {
                    arr[i] = right[r];
                    return sort(arr, left, right, length, l, r + 1, i + 1);
                }
            } else if (l < left.length) {
                arr[i] = left[l];
                return sort(arr, left, right, length, l + 1, r, i + 1);
            } else {
                arr[i] = right[r];
                return sort(arr, left, right, length, l, r + 1, i + 1);
            }
        }
    }

    void hasilMargeSort(Mahasiswa[] data){
        if (data != null) {
            data = marge(data, 0, data.length - 1);
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i].nama);
            }
        }
    }
}
