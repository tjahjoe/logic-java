public class binarySearch {
    public static void main(String[] args) {
        int num[] = { 0, 0, 0, 1, 2, 2, 3, 4, 6, 7 };
        System.out.println(binarySearch(6, num, 0, num.length - 1));
        System.out.println(selectionSearch(6, num, 0));
    }

    static int binarySearch(int key, int arr[], int l, int r) {
        int mid = (l + r) / 2;
        if (key == arr[mid]) {
            return mid;
        } else if (r < l) {
            return -1;
        } else {
            if (key < arr[mid]) {
                return binarySearch(key, arr, l, mid - 1);
            } else {
                return binarySearch(key, arr, mid + 1, r);
            }
        }
    }

    static int selectionSearch(int key, int arr[], int i) {
        if (key == arr[i]) {
            return i;
        } else if (i == arr.length - 1) {
            return -1;
        } else {
            return selectionSearch(key, arr, i + 1);
        }
    }
}
