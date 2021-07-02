import java.util.Arrays;

public class Task5 {

    private static int[] a = {3,1,2,5,6,4};
    private static DoublyList h1 = new DoublyList(a);

    public static void main(String[] args) {
        sort();
        print();
    }

    private static void sort() {
        for (DoublyNode n = h1.head.next; n != h1.head; n = n.next) {
            DoublyNode m = n.next;
            while (m != h1.head && m.element < m.prev.element) {
                int temp = m.element;
                m.element = m.prev.element;
                m.prev.element = temp;
                m = m.prev;
            }
        }
    }

    private static void print() {
        System.err.println("Doubly LinkedList Insertion Sort algorithm");
        for (DoublyNode n = h1.head.next; n != h1.head; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

}

class DoublyNode{

    public int element;
    public DoublyNode next;
    public DoublyNode prev;

    public DoublyNode(int e, DoublyNode n, DoublyNode p){
        element = e ;
        next = n;
        prev = p;
    }

}

class DoublyList{
    public DoublyNode head;

    public DoublyList(int [] a){
        head = new DoublyNode(0, null, null);
        DoublyNode tail = head;

        for(int i = 0; i<a.length; i++){
            DoublyNode mn = new DoublyNode(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }

}

