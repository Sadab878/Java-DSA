package LinkedList;

public class DisplaList {
    // public static void DisplayRec(Node head){
    //     if(head == null) return;
    //     System.out.print(head.val+" ");
    //     DisplayRec(head.next);
    //     DisplayRec(head.next);
    //     System.out.print(head.val+" ");
    // }
    public static void Display(Node head){
    //     Node temp = head;
    //     while(temp!=null){
    //         System.out.print(temp.val+" ");
    //         temp = temp.next;

    //     }
    //     for(Node temp = head; temp!=null; temp=temp.next){
    //          System.out.print(temp.val+" ");
    //      }
    //     System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50); 

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Display(a);
        // DisplayRec(a);

        System.out.println(get(a,4));



    }
    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i = 1; i <= idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
