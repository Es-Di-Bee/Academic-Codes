import java.util.Scanner;
public class Node {
      Scanner sc = new Scanner(System.in);
      public Object elem = null;
      public Node next = null;
      
      public Node(Object e, Node n) {
            this.elem = e;
            this.next = n;
      }
      
      public void create(Node n1) {
            for (int c = 1; c <= 6; ++c) { 
                  n1.elem = sc.next();
                  if (c != 6) n1.next = new Node(null, null);
                  n1 = n1.next;
            }
      }
      
      public void print(Node n1) {
            System.out.print("The elements are: " );
            for (; n1 != null; n1 = n1.next) {
                  System.out.print(n1.elem + " ");
            }
            System.out.println();
      }
      
      public int count(Node n1) {
            int count = 0;
            for (; n1 != null; n1 = n1.next) {
                  ++count;
            }
            return count;
      }
      
      public Object getElement(Node n1, int index) {
            int count = 0;
            System.out.print("The element is: ");
            for (; n1 != null; n1 = n1.next) {
                  if (count == index) return n1.elem;
                  ++count;
            }
            return "Index Not Found";
      }
      
      public void setElement(Node n1, int index) {
            int count = 0;
            for (; n1 != null; n1 = n1.next) {
                  if (count == index) {
                        n1.elem = sc.next();
                        break;
                  }
                  ++count;
            }
      }
      
      public boolean searchElement(Node n1, String str, int index) {
            int count = 0;
            System.out.print("Element found at that index: ");
            for (; n1 != null; n1 = n1.next) {
                  if (count == index) {
                        if (n1.elem.equals(str)) return true;
                  }
                  ++count;
            }
            return false;
      }
      
      public Node insertAtFirst(Node n1) {
            System.out.print("Input an element for inserting at first index");
            Node temp = new Node(sc.next(), n1);
            n1 = temp;
            return n1;
      }
      
      public Node insertAtLast(Node n1) {
            System.out.print("Input an element for inserting at last index");
            int lastElem = count(n1);
            Node head = n1;
            Node temp = new Node(sc.next(), null);
            for (int c = 1; c <= lastElem; ++c, n1 = n1.next) {
                  if (c == lastElem) {
                        n1.next = temp;
                  }
            }
            return head;
      }
      
      public Node insertAtIndex(Node n1, int index) {
            System.out.print("Input an element for inserting at middle index");
            Node head = n1;
            int count = 0;
            for (; n1 != null; n1 = n1.next) {
                  if (count == index-1) { // -1 for inserting before that index
                        Node temp = new Node(sc.next(), n1.next);
                        n1.next = temp;
                        break;
                  }
                  ++count;
            }
            return head;
      }
      
      public Node removeAtFirst(Node n1) {
            Node head = n1.next;
            n1.elem = null;
            n1.next = null;
            return head;
      }
      
      public Node removeAtLast(Node n1) {
            Node head = n1;
            Node temp = new Node(null, null);
            while (n1.next != null) {
                  temp = n1;
                  n1 = n1.next;
            }
            n1.elem = null;
            n1.next = null;
            temp.next = null;
            return head;
      }
      
      public Node removeAtIndex(Node n1, int index) {
            Node head = n1;
            int count = 0;
            for (; n1 != null; n1 = n1.next) {
                  if (count == index-1) { 
                        Node temp = n1.next;
                        n1.next = temp.next;
                        temp.elem = null; temp.next = null;  
                  }
                  ++count;
            }
            return head;
      }
      
}
