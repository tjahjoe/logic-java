package Queue;

public class Queue {
    int front;
    int rear;
    int[] data;
    int size;
    int max;

    Queue(int jumlah) {
        front = rear = -1;
        size = 0;
        max = jumlah;
        data = new int[jumlah];
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void addData(int d) {
        if (isFull()) {
            System.out.println("Data sudah penuh");
        } else {
            rear = (rear + 1) % max;
            data[rear] = d;
            size++;
        }
    }

    int removeData() {
        int temp = 0;
        if (isEmpty()) {
            System.out.println("Data tidak tersedia");
        } else {
            temp = data[front];
            front = (front + 1) % max;
            size--;
        }
        return temp;
    }
}
