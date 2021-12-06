public class LinkedList{
  public Node head;  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node x=new Node(a[i],null);
      tail.next=x;
      tail=x;//tail=tail.next;
    }
  }
  
  ///***********************************************************
 /* prints the elements in the list */
  public void printList(){
    // TO DO
  }
  
  public LinkedList listSpecial(){
   //Todo
    
    
  }
  ///***********************************************************
}