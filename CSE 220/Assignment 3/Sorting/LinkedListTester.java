public class LinkedListTester{
    public static void main(String [] args){

        int [] a1 = {21, 13, 23, 21, 13, 29};
        LinkedList h1 = new LinkedList(a1);
        
        h1.printList();
        h1.sort();
        h1.printList();
    }
}