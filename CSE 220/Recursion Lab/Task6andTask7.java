public class Task6andTask7 {
    public static Object[] a = {10,20,30,40};
    public static Node prev = new Node(null, null);
    public static int i = 0;
    public static Node head = null;
        
    public static void main(String[] args) {
        insert(head);
        reversePrint(head);
    }
    private static Node insert(Node n) {  
        if (i == a.length) {
            return n;
        }
        n = new Node(a[i], null);
        if (i == 0) head = n;
        prev.next = n;
        prev = prev.next;
        ++i;
        return insert(n.next);
    }
    
    public static void reversePrint(Node n){
        if (n == null) return;
        reversePrint(n.next);
        System.out.println(n.elem);
    }
}

class Node {
    Object elem;
    Node next;
    public Node(Object e, Node n) {
        elem = e;
        next = n;
    }
}