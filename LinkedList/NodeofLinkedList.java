package LinkedList;

public class NodeofLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node d = new Node(30); 
        Node c = new Node(40); 
        Node e = new Node(50); 

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        // System.out.println(b);
        // System.out.println(a.next);
        
    }
}
