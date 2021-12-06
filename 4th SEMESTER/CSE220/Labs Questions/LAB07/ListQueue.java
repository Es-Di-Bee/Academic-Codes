public class ListQueue implements Queue
{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue()
    {
        size = 0;
        front = null;
        rear = null;
    }
     public int size()
     {
         return size;
     }
     public boolean isEmpty()
     {
         if ( size == 0 )
         {
             return true;
         }
         return false;
     }
     public void enqueue(Object o) 
     {
         Node newNode = new Node (o,null);
         if ( isEmpty() )
         {
             front = newNode;
             rear = newNode;
         }
         else
         {
             rear.next = newNode;  
             rear = rear.next;
         }
         size++;
     }
     public Object dequeue() throws QueueUnderflowException
     {
         Node removedNode = front;
         Object temp = null;
         if ( !isEmpty() )
         {
            front = removedNode.next;
            temp = removedNode.val;
            size--;
            removedNode.next = null;
            removedNode.val = null;
            return temp;
         }
         else
         {
             throw new QueueUnderflowException();
         }
     }
     public Object peek() throws QueueUnderflowException
     {
         if ( !isEmpty() )
         {
             return front.val;
         }
         else
         {
             throw new QueueUnderflowException();
         }
     }
     public String toString()
     {
         String f = " ";
         if ( isEmpty() )
         {
             f = "Empty Queue";
         }
         else
         {
             Node v = front; 
             do {
                 if ( v == front )
                 {
                     f = "[ " + v.val + " ";
                 }
                 else if ( v == rear )
                 {
                     f = f + v.val + " ]" ;
                 }
                 else
                 {
                     f = f + v.val + " " ;
                 }
                 v = v.next;
             }while ( v != null);
         }
         return f;
     }
     public Object[] toArray()
     {
         Object [] a = new Object [size]; 
         if ( !isEmpty() )
         {
             Node v = front;
             for ( int j = 0; j <= size - 1; j++ )
             {
                 a[j] = v.val;
                 v = v.next;
             }
         }
         return a;
     }
     public int search(Object o)
     {
         int pos = 0;
         for ( Node  v = front; v != null; v = v.next )
         {
             if ( v.val == o )
             {
                 return pos;
             }
             pos++;
         }
         return -1;
     }
}