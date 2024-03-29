import java.lang.reflect.Array;
import java.util.Arrays;

public class margesort1 {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 1, 7, 2, 0, 0, 0, 6 };
        System.out.println(Arrays.toString(marge(arr, 0, arr.length - 1)));
    }

    static int[] marge(int[] arr, int l, int r) {
        if (l == r) {
            return new int[] { arr[l] };
        } else {
            int mid = (l + r) / 2;
            int left[] = marge(arr, l, mid);
            int right[] = marge(arr, mid + 1, r);
            int sort[] = sort(new int[r - l + 1], left, right, r - l + 1, 0, 0, 0);
            return sort;
        }
    }

    static int[] sort(int[] arr, int[] left, int[] right, int length, int l, int r, int i) {
        if (i == length) {
            return arr;
        } else {
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
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
}
