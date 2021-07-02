import java.util.Scanner;
public class Tester {
      public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            Node head = new Node(null, null);     
            
            head.create(head);
            head.print(head);
            System.out.println("Number of elements: " + head.count(head));
            System.out.println(head.getElement(head, 2));
            head.setElement(head, 0);
            head.print(head);
            System.out.println(head.searchElement(head, sc1.next(), 0));
            head = head.insertAtFirst(head);
            head.print(head);
            head = head.insertAtLast(head);
            head.print(head);
            head = head.insertAtIndex(head, 2);
            head.print(head);
            head = head.removeAtFirst(head);
            head.print(head);
            head = head.removeAtLast(head);
            head.print(head);
            head = head.removeAtIndex(head, 3);
            head.print(head);
      }
}