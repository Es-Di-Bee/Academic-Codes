import java.util.Arrays;

public class Task3 {

    private static int[] a = {3,1,2,5,6,4};
    private static LinkedList h1 = new LinkedList(a);

    public static void main(String[] args) {
        sort();
        print();
    }

    private static void sort() {
        for (int i = 0; i < a.length; ++i) {
            for (Node n = h1.head; n.next != null; n = n.next) {
                if (n.element > n.next.element) {
                    int temp = n.element;
                    n.element = n.next.element;
                    n.next.element = temp;
                }
            }
        }
    }

    private static void print() {
        System.err.println("Singly LinkedList Bubble Sort algorithm");
        for (Node n = h1.head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

}

class Node{

    public int element;
    public Node next;

    public Node(int e, Node n){
        element = e ;
        next = n;
    }

}

class LinkedList {
    public Node head;

    public LinkedList(int[] a) {
        head = new Node(0, null);
        Node temp = head;
        for (int i = 0; i < a.length - 1; ++i) {
            head.element = a[i];
            head.next = new Node(a[i + 1], null);
            head = head.next;
        }
        head = temp;
    }
}

