import java.util.Scanner;
public class LinkedListTester{
  public static void main(String [] args){
    
    System.out.println("\n/////  Test 01  /////");
    Object [] a1 = {10,20,30,40};
    LinkedList h1 = new LinkedList(a1); // Creates a linked list using the values from the array
    // head will refer to the Node that contains the element from a[0]    
    
    Object [] st = {"hello!world","value","testing","how it works?", "cds"};
    
    // *************************************************************
    LinkedList h_st = new LinkedList(st);
    h_st.printList();
    LinkedList x = h_st.listSpecial();  //
    x.printList(); // h9d,5,t5g,11,3
    
    
    // take another input for string array length
    // then take string array values.
    // make linked list from the new string array.
    // print the list
    // print the special list
    //TODO
    
    
    
    
    //************************************************************
    
    
  }
  
}