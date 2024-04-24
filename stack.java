import java.util.Arrays;

public class stack {
    int data [];
    int top = -1;
    // boolean isFull;
    // boolean isEmpty;

    stack(int panjang){
        this.data = new int[panjang];
    }

    boolean isEmpty(){
        if (top == -1) {
           return true;
        } else {
            return false;
        }
    }

    boolean isFull(){
        if (top == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(int angka){
        if (!isFull()) {
            top++;
            data[top] = angka;
        }
    }

    void pop(){
        if (!isEmpty()) {
            top--;
        }
    }

    void show(){
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    void peak(){
        if (!isEmpty()) {
            System.out.println(data[top]);
        }
    }

    void clear(){
        top = -1;
    }



    public static void main(String[] args) {
        stack inp = new stack(2);
        System.out.println(inp.isEmpty());
        inp.push(9);
        inp.push(1);
        inp.pop();
        inp.pop();
        inp.push(89);
        inp.push(77);
        inp.clear();
        inp.show();
        inp.peak();
    }
}
