import java.util.Arrays;

public class margeSort {
    public static void main(String[] args) {
        int ar[] = { 12, 20, 1, 100, 8, 9, 80, 7};
        System.out.println(Arrays.toString(ar));
        mr(ar);
    }

    static int[] mr(int[] n) {
        int a = n.length / 2;
        if (n.length > 1) {
            int left[] = new int[a];
            for (int i = 0; i < a; i++) {
                left[i] = n[i];
            }
            mr(left);//memberhentikan rekursif
            int right[] = new int[n.length - a];
            for (int i = a, o = 0; i < n.length; i++, o++) {
                right[o] = n[i];
            }
            mr(right);//memberhentikan rekursif
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
//bisa di sederhanakan