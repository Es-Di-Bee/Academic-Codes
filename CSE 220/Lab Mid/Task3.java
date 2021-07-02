import java.util.Scanner;
public class Task3 {
    public static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Node tail = new Node(null,null);
        String order = sc.nextLine();
        Node head = new Node(order, null);
        Node tail = head;
        for (int i = 0 ; i < 6; ++i) {
            order = sc.nextLine();s
            Node temp = new Node(order, null);
            tail.next = temp;
            tail = temp;
        }
        head = new Node(null, head);
        tail.next = head;
        replace();
        // print
        for(Node n = head.next; n != head; n=n.next) {
            System.out.println(n.elem);
        }
    }
    
    public rearrange() {
        Scanner sc2 = new Scanner(System.in);
        int pos1 = sc2.nextInt();
        int pos2 = sc2.nextInt();
        int count = 0;
        for(Node n = head.next; n != head; n=n.next) {
            if (count == pos1) {
                n.elem = name;
            }
        }
    }
}

class Node {
    Object elem = null;
    Node next = null;
    public Node(Object e, Node n) {
        elem = e;
        next = n;
    }
}