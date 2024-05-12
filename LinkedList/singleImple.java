class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private int sz;
    LinkedList() {
        head = null;
        sz = 0;
    }

    void append(int val) {
        // Method for adding at last tail
        Node newnode = new Node(val);
        if(head == null) {
            head = newnode;
            sz++;
            return;
        }
        Node it = head;
        while(it.next != null) {
            it = it.next;
        }
        it.next = newnode;
        newnode.next = null;
        sz++;
        return;
    }

    // Method for inserting in head
    void preappend(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            sz++;
            return;
        }
        Node temp = head;
        newNode.next = temp;
        head = newNode;
        sz++;
        return;
    }

    // Inserting at any index
    void insert(int val, int index) {
        Node newNode = new Node(val);
        if(index == 0) {
            this.preappend(val);
            return;
        } else if(index == sz - 1) {
            this.append(val);
            return;
        }
        if(index < 0 || index >= sz) {
            throw new IndexOutOfBoundsException("Index out of bound");
        }
        int idx = 0;
        Node it = head;
        while(idx != index - 1) {
            idx++;
            it = it.next;
        }
        newNode.next = it.next;
        it.next = newNode;
        sz++;
    }

    // Method to get size
    int length() {
        return this.sz;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        Node it = head;
        while (it != null) {
            output.append(it.data).append(" -> ");
            it = it.next;
        }
        output.append("null");
        return output.toString();
    }
}
public class singleImple {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // Inserting at last
        ll.append(10);
        ll.append(23);
        System.out.println(ll.length());
        System.out.println(ll);

        // Inserting at head
        ll.preappend(-12);
        ll.preappend(87);
        System.out.println(ll);

        System.out.println("Length: " + ll.length());
        ll.insert(78, 1);
        System.out.println(ll);
        ll.insert(-8, 3);
        System.out.println(ll);
        System.out.println("Length: " + ll.length());
    }
}
