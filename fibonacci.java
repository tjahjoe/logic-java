package logicjava;

public class fibonacci {
    public static void main(String[] args) {
        int angka[] = new int[3];
        angka[0] = 1;
        for (int i = 0; i < 5; i++) {
            angka[1] = angka[0];
            angka[0] = angka[2] + angka[1];
            System.out.println(angka[2] + " + " + angka[1] + " : " + angka[0]);
            angka[2] = angka[1];

        }
    }
}
