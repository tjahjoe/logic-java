import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int a [] = {1, 2, 3, 5};
        int b [] = a;
        int c [] = a;
        b[3] = 2;


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }
}
