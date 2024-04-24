import java.util.Arrays;

public class latihansorting {
    public static void main(String[] args) {
        int arr[] = {2, 3,1, 4, 5, 6, 9,8, 7};
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int indeks = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[indeks] > arr[j]) {
        //             indeks = j;
        //         }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[indeks];
        //     arr[indeks] = temp;
        // }

        // for (int i = 1; i < arr.length; i++) {
        //     for (int j = i; j > 0; j--) {
        //         if (arr[j] > arr[j - 1]) {
        //             break;
        //         }
        //         int temp = arr[j];
        //         arr[j] = arr[j - 1];
        //         arr[j - 1] = temp;
        //     }
        // }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            for (int j = i; j > 0 && temp < arr[j - 1]; j--) {
                index = j - 1;
                arr[j] = arr[j - 1];
            }
            arr[index] = temp;
        }

        // for (int i = 1; i < arr.length; i++) {
        //     int j = i;
        //     int temp = arr[i];
        //     while (j > 0 && arr[j - 1] > temp) {
        //         arr[j] = arr[j - 1];
        //         j--;
        //     }
        //     arr[j] = temp;
        // }
        System.out.println(Arrays.toString(arr));
    }
}
