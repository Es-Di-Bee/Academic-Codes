public class LinkedList{
      public Node head;
      
      
      /* First Constructor:
       * Creates a linked list using the values from the given array. head will refer
       * to the Node that contains the element from a[0]
       */
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
      
      /* Second Constructor:
       * Sets the value of head. head will refer
       * to the given LinkedList
       */
      public LinkedList(Node h){
            head = h;
      }
      
      /* Counts the number of Nodes in the list */
      public int countNode(){
            int count = 0;
            for(Node n = head; n != null; n = n.next)
                  ++count;
            return count;
      }
      
      /* prints the elements in the list */
      public void printList(){
            for(Node n = head; n != null; n = n.next)
                  System.out.print(n.element + " ");
            System.out.println();
      }
      
      // returns the reference of the Node at the given index. For invalid index return null.
      public Node nodeAt(int idx){
            int count = 0;
            for (Node n = head; n != null; n = n.next) {
                  if (count == idx) return n;
                  ++count;
            }
            return null;
      }
      
      
      // returns the element of the Node at the given index. For invalid idx return null.
      public Object get(int idx){
            int count = 0;
            for (Node n = head; n != null; n = n.next) {
                  if (count == idx) {
                        return n.element;
                  }
                  ++count;
            }
            return null;
      }
      
      
      
      /* updates the element of the Node at the given index.
       * Returns the old element that was replaced. For invalid index return null.
       * parameter: index, new element
       */
      public Object set(int idx, Object elem){
            int count = 0;
            for (Node n = head; n != null; n = n.next) {
                  if (count == idx) {
                        Object temp = n.element;
                        n.element = elem;
                        return temp;
                  }
                  ++count;
            }
            return null;
      }
      
      
      /* returns the index of the Node containing the given element.
       if the element does not exist in the List, return -1.
       */
      public int indexOf(Object elem){
            int count = 0;
            for (Node n = head; n != null; n = n.next) {
                  if (n.element == elem) {
                        return count;
                  }
                  ++count;
            }
            return -1; // please remove this line!
      }
      
      // returns true if the element exists in the List, return false otherwise.
      public boolean contains(Object elem) {
            for (Node n = head; n != null; n = n.next) {
                  if (n.element.equals(elem))
                        return true;
            }
            return false; // please remove this line!
      }
      
      // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
      public Node copyList() {
            Node newList = new Node(null, null);
            Node address = newList;
            Node temp = this.head;
            while(temp != null) {
                  newList.element = temp.element;
                  newList.next = temp.next;
                  newList = newList.next;
                  temp = temp.next;
            }
            newList = address;
            return  newList;
      }
      
      // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
      public Node reverseList(){
            Node newList = null;
            for (Node n = this.head; n != null; n = n.next) {
                  Node temp = new Node(n.element, newList);
                  newList = temp;
            }
            return newList;
      }
      
      /* inserts Node containing the given element at the given index
       * Check validity of index.
       */
      public void insert(Object elem, int idx){
            int count = 0;
            for (Node n =this.head; n != null; n = n.next) {
                  if (idx == 0) {
                        Node temp = new Node(elem, n);
                        this.head = temp;
                        break;
                  }
                  if (count == idx-1) { // -1 for inserting before that index
                        Node temp = new Node(elem, n.next);
                        n.next = temp;
                        break;
                  }
                  ++count;
            }
      }
      
      
      /* removes Node at the given index. returns element of the removed node.
       * Check validity of index. return null if index is invalid.
       */
      public Object remove(int index){
            int count = 0;
            for (Node n =this.head; n != null; n = n.next) {
                  if (index == 0) {
                        Object temp = n.element;
                        this.head = n.next;
                        return temp;
                  }
                  if (count == index-1) { 
                        Object temp = n.next.element;
                        n.next = n.next.next;
                        return temp;
                  }
                  ++count;
            }
            return null;
      }
      
      // Rotates the list to the left by 1 position.
      public void rotateLeft(){
            Node temp = this.head;
            this.head = this.head.next;
            Node n = this.head;
            while(n.next != null) {
                  n = n.next;
            }
            n.next = temp;
            temp.next = null;
      }
      
      // Rotates the list to the right by 1 position.
      public void rotateRight(){
            Node firstElem = this.head;
            Node n = this.head;
            Node prev = null;
            while(n.next != null) {
                  prev = n;
                  n = n.next;
            }
            Node temp = prev.next;
            temp.next = firstElem;
            prev.next = null;
            this.head = temp;
      }
      
}