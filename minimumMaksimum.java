public class minimumMaksimum {
    public static void main(String[] args) {
        int[] a = { 3, 55, 2, 5, 1000, 200, 200 };
        System.out.println("Maksimum : " + devide(a[0], 1, a, a[0], a.length)[0]);
        System.out.println("Minimum : " + devide(a[0], 1, a, a[0], a.length)[1]);

        System.out.println("Maksimum : " + brute(a)[0]);
        System.out.println("Minimum : " + brute(a)[1]);
    }

    public static int[] brute(int[] x) {
        int[] o = { x[0], x[0] };
        for (int i = 1; i < x.length; i++) {
            if (o[0] < x[i]) {
                o[0] = x[i];
            } else if (o[1] > x[i]) {
                o[1] = x[i];
            }
        }
        return o;
    }

    public static int[] devide(int v, int w, int[] x, int y, int z) {
        if (z <= 1) {
            return new int[] { y, v };
        } else if (y < x[w]) {
            return devide(v, w + 1, x, x[w], z - 1);
        } else if (v > x[w]) {
            return devide(x[w], w + 1, x, y, z - 1);
        } else {
            return devide(v, w + 1, x, y, z - 1);
        }
    }
}
