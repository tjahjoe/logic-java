// package logicjava;

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
        fungsiRekursif(0, 1, 8);
    }

    public static int fungsiRekursif(int x, int y, int z){
        if (z < 1) {
            return 0;
        } else{
            int a = x + y;
            System.out.println(a);
            return fungsiRekursif(a, x, z-1);
        }
    }
}
