import java.util.*;

public class DoublyList{
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;

        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode(){
        int count = 0;
        for(Node n = this.head.next; n != head; n = n.next) {
            ++count;
        }
        return count;
    }

    /* prints the elements in the list */
    public void forwardprint(){
        for(Node n = this.head.next; n != head; n = n.next) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }

    public void backwardprint(){
        for(Node n = this.head.prev; n != head; n = n.prev) {
            System.out.print(n.element + " ");
        }
        System.out.println();
    }


    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        int count = 0;
        for(Node n = this.head.next; n != head; n = n.next) {
            if (count == idx) return n;
            ++count;
        }
        return null;
    }



    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int count = 0;
        for(Node n = this.head.next; n != head; n = n.next) {
            if (n.element == elem) return count;
            ++count;
        }
        return -1;
    }



    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node newNode = new Node(elem, null, null);
        if (idx == 0) {
            newNode.next = head.next;
            head.next.prev = newNode;
            newNode.prev = head;
            head.next = newNode;
        } else {
            Node n1 = nodeAt(idx-1);
            newNode.next = n1.next;
            newNode.prev = n1;
            n1.next.prev = newNode;
            n1.next = newNode;
        }
    }




    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        if (index < 0 || index >= countNode()) return null;
        if (index == 0) {
            Node n1 = head.next;
            Object temp = n1.element;
            head.next = n1.next;
            n1.next.prev = head;
            n1.next = null; n1.prev = null; n1.element = null;
            return temp;
        }
        Node n1 = nodeAt(index-1);
        Node n2 = n1.next;
        Object temp = n2.element;
        n1.next = n2.next;
        n2.next.prev = n1;
        n2.next = null; n2.prev = null; n2.element = null;
        return temp;
    }

    // the below methods are for the others tasks of the assignment

    public Object getElem(int idx) {
        Node temp = nodeAt(idx);
        return temp.element;
    }

    public void setElem(Object obj, int idx) {
        nodeAt(idx).element = obj;
    }

    public void searchElem(Object obj, int idx) {
        if (obj == nodeAt(idx).element) System.out.println("Found");
        else System.out.println("Not Found");
    }

    public void reverse() {
        Node head2 = new Node(null, null, null);
        Node tail = head2;
        for (Node n = this.head.prev; n != head; n = n.prev) {
            Node temp = new Node(n.element, null, null);
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
        }
        tail.next = head2;
        head2.prev = tail;
        this.head = head2;
    }

}