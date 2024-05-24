public class DLL {
    Node29 head;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(int data){
        if (isEmpty()) {
            head = new Node29(null, data, null) ;         
        } else {
            Node29 nd = new Node29(null, data, head);
            head.prev = nd;
            head = nd;
        }
        size++;
    }

    void addLast(int data){
        if (isEmpty()) {
            head = new Node29(null, data, null);
        } else {
            Node29 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node29(current, data, null);
        }
        size++;
    }

    void add(int data, int index){
        if (index < 0 || index > size) {
            
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node29 current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            if (current.next == null) {
                Node29 nd = new Node29(current, data, null);
                current.next = nd;
            } else {
                Node29 nd = new Node29(current, data, current.next);
                current.next.prev = nd;
                current.next = nd;
            }
            size++;
        }
    }
}