public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
// The number of items on the stack
    public int size(){
    Node n=top; int count=0;
    for(;n.next!=null;count++,n=n.next){
    return count;
    }}
    
    public boolean isEmpty(){
    if (size()==0){
    return true;}
    return false;}
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
      if(size()==5){
      throw new  StackOverflowException();
      }
      Node mn=new Node(e,top);// eikhane constractor e top lkhar karone mn.next=top likhte hoe ni.
    top=mn;
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{//make sure return korteso tmi shuchi
    
    if(size()==0){
      throw new  StackUnderflowException();
      }
     Object ishraq;
     ishraq=top.val;// return e top ta pathate hobe tai ishraq e rakhlam
    top=top.next;
    return ishraq;}//suppose 4top.next chilor 5top chilo...5out hoe top.next=4 ,top hoe jabe
    
    
    
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{//eikhane top er just val ta dibo bt top er jaigae kono chance hobe na
 
    if(size()==0){
      throw new  StackUnderflowException();
      }
    return top.val;}//Node thake return top ditam bt object likha bole top.val likha hoise
    
    public String toString(){
      String output = "";
      for (Node n=top;n!=null;n=n.next){
        output=output+n.val+" ";
      }
      return output;
    }
    
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        Object[] array=new Object[size];
        Node n=top;
        for(int count=0; count<size; count++, n=n.next){//list k dhore array te dhukano hocche so array tar size oronto gelei hoise list er null check er dorkar nai
          array[count]=n.val;//top.val?
        }
        return array;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
    Node n=top; int count=0;
    for(;n.next!=null;n=n.next,count++){
      if (n.val==e){return count;}
    }return -1;}}
    
    