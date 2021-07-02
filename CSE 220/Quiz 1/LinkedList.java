public class LinkedList{
      public Node head;
      
      public LinkedList(Object [] a){
            head = new Node(null, null);
            Node temp = head;
            for (int i = 0; i < a.length-1; ++i) {
                  head.element = a[i];
                  head.next = new Node(a[i+1],null);
                  head = head.next;
            }
            head = temp;
            
      }
      
}