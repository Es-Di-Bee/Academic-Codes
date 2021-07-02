public class LinkedList{
    public Node head;
    
    public LinkedList(int [] a){
        head = new Node(0, null);
        Node temp = head;
        for (int i = 0; i < a.length-1; ++i) {
            head.element = a[i];
            head.next = new Node(a[i+1],null);
            head = head.next;
        }
        head = temp;
        
    }
    
    public void printList(){
        for(Node n = head; n != null; n = n.next)
            System.out.print(n.element + " ");
        System.out.println();
    }
    
    
    public void sort() {
        Node n1 = this.head;
        while(n1 != null) {
            for (Node n2 = n1.next; n2 != null; n2 = n2.next) {
                if(n1.element > n2.element) {
                    int x = n1.element;
                    n1.element = n2.element;
                    n2.element = x;
                }
            }
            n1 = n1.next;
        }
    }
}