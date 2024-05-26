public class Queue {
    int data[];
    int size;
    int max;
    int front, rare;

    Queue(int size) {
        this.max = size;
        this.data = new int[max];
        this.size = 0;
        this.rare = this.front = -1;
    }

    boolean isFull() {
        return size == max;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("data sudah penuh");
        } else {
            if (isEmpty()) {
                front = rare = 0;
            } else {
                rare = (rare + 1) % max;
            }
            this.data[rare] = data;
            size++;
        }
    }

    int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("data kosong");
        } else {
            data = this.data[front];
            size--;
            if (isEmpty()) {
                front = rare = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return data;
    }

    void peek(){
        if (isEmpty()) {
            System.out.println("data kosong");
        } else {
            System.out.println(data[front]);
        }
    }

    void print(){
        if (isEmpty()) {
            System.out.println("data kosong");
        } else {
            int temp = front;
            while (temp != rare) {
                System.out.println(data[temp]);
                temp = (temp + 1) % max;
            }
            System.out.println(data[temp]);
        }
    }

    void clear(){
        if (isEmpty()) {
            System.out.println("data kosong");
        } else {
            front = rare = -1;
            size = 0;
        }
    }
}
