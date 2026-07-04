package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;
    void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) {
            head = tail = temp;

        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void Display() {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int get(int idx) {
        Node temp = head;
        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;
    }

    void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid Index");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp = head;
            for(int i= 0; i<idx-1;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;

        }
    }

    void delete(int idx){
        // if(idx<0 || idx>size) {
        //     System.out.println("Invalid Index");
        //     return;
        // }
        // if(idx==0) deleteAtHead();
        Node temp = head;
        for(int i = 0; i<=idx; i++){
            temp = temp.next;
        }
        temp.next =temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.Display();
        ll.addAtHead(5);
        ll.Display();
        ll.deleteAtHead();
        ll.Display();
        System.out.println(ll.size);
        ll.insert(60,2);
        ll.Display();
        System.out.println(ll.get(2));
        ll.delete(3);
        ll.Display();

    }
}
