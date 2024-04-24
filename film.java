// package logicjava;

public class film {
    public static void main(String[] args) {
        int rating[][] = {{4, 3, 4, 4},{1, 1, 2, 3}, {1, 2, 3, 4}};
        double rata2[] = new double[4];
        double tampung = 0;
        rata2 = hitungRata2(rating, rata2);
    }
    public static double[] hitungRata2(int rating[][], double rata2[]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                rata2[i] += rating[j][i];
            }
            rata2[i] /= 3;
            System.out.println("rata rata"+i+ " : " + rata2[i]);
        }
        return rata2;
    }
}