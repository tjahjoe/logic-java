import java.util.Arrays;

public class margeSort2 {
    public static void main(String[] args) {
        int angka[] = { 22, 12, 42, 4, 2, 100 };
        marge(angka, 0, angka.length);
    }

    static int[] marge(int[] angka, int min, int max){
        if (max > 1) {
            max = max / 2;
            marge(angka, min, max);
            for (int i = 0; i < max; i++) {
                System.out.print(angka[i] + " ");
            }
            System.out.println();
            for (int i = max; i < angka.length; i++) {
                System.out.print(angka[i] + " ");
            }
            System.out.println();
        }
        return angka;
    }
}
