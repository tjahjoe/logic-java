import java.util.Arrays;

public class margeSort {
    public static void main(String[] args) {
        int ar[] = { 12, 20, 100, 8 };
        System.out.println(Arrays.toString(mr(ar)));
        // mr(ar);
    }

    static int[] mr(int[] n) {
        int a = n.length / 2;
        if (n.length > 1) {
            int left[] = new int[a];
            for (int i = 0; i < a; i++) {
                left[i] = n[i];
            }
            mr(left);
            int right[] = new int[n.length - a];
            for (int i = a, o = 0; i < n.length; i++, o++) {
                right[o] = n[i];
            }
            mr(right);
            int l = 0;
            int r = 0;
            int i = 0;
            while (i < n.length) {
                if (l < left.length && r < right.length) {
                    if (left[l] < right[r]) {
                        n[i] = left[l];
                        l++;
                    } else {
                        n[i] = right[r];
                        r++;
                    }
                } else if (l < left.length) {
                    n[i] = left[l];
                    l++;
                } else if (r < right.length) {
                    n[i] = right[r];
                    r++;
                }
                i++;
            }

        }
        System.out.println(Arrays.toString(n));
        return n;
    }
}
