import java.util.Arrays;

public class margeSort {
    public static void main(String[] args) {
        int ar[] = { 12, 2, 45, 3, 18, 20, 14, 22 };
        // System.out.println(Arrays.toString(mr(ar)));
        mr(ar);
    }

    static int[] mr(int[] n) {
        int a = n.length / 2;
        if (n.length > 1) {
            int left[] = new int[a];
            for (int i = 0; i < a; i++) {
                left[i] = n[i];
            }
            System.out.println(Arrays.toString(mr(left)));
            // mr(left);
            // pengurutan
            int right[] = new int[n.length - a];
            for (int i = a, o = 0; i < n.length; i++, o++) {
                right[o] = n[i];
            }
            System.out.println(Arrays.toString(mr(right)));
        }
        // System.out.println(Arrays.toString(n));
        return n;
    }
}
