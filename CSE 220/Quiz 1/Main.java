import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Object [] a1 = {1,2,3,4,5,6};
        LinkedList h1 = new LinkedList(a1);
        h1.head = swapDeleteMid(h1.head);
        
        for (Node n = h1.head; n != null; n = n.next) {
            System.out.println(n.element);
        }
    }
    
    public static Node swapDeleteMid (Node head) {
        if (head == null) return null;
        if (head.next == null) {
            head = head.next;
            return head;
        }
        Node n1 = head.next;
        Node n2 = head;
        while (n2.next.next != null) {
            n2 = n2.next;
        }
        Object temp = n1.element;
        n1.element = n2.element;
        n2.element = temp;
        int noOfElement = 0;
        for (Node n = head; n != null; n = n.next) {
            noOfElement++;
        }
        int midIndex = noOfElement / 2;
        int count = 0;
        Node q = null;
        for (Node n = head; n != null; n = n.next, ++count) {
            if (count == midIndex-1) {
                q = n;
            }
        }
        q.next = q.next.next;
        return head;
    }
    
}