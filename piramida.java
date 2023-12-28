/**
 * piramida
 */
public class piramida {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}