public class ArrayStack implements Stack
{
    int size;
    Object [] data;
    public ArrayStack()
    {
        size=0;
        data = new Object[5];
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
    public void push(Object e) throws StackOverflowException
    {
        if ( size == data.length )
        {    throw new StackOverflowException();     }
        else
        {    data[size] = e;
            size++;     }
    }
   
    public Object pop() throws StackUnderflowException
    {
        if ( !isEmpty() )
        {
            Object temp = data[size-1];
            data[size-1] = null;
            size--;
            return temp;
        }
        else
        {
            throw new StackUnderflowException();
        }
    }
    public Object peek() throws StackUnderflowException
    {
        if ( !isEmpty() )
        {
            return data[size-1];
        }
        else
        {
            throw new StackUnderflowException();
        } 
    }
    public String toString()
    String output = "";
      for (int n=0;n<n.length;n++){
        output=output+data[size]+" ";
      }
      return output;
    }
    public Object[] toArray()
    {  Object [] a = new Object [size];
        for ( int v = 0, j = size - 1; j >= 0; v++, j-- )
        {  if ( data[j] != null )
            {  a[v] = data[j];        }
        }    return a;
    }
    public int search(Object e)
    {    int count = 0;
        for ( int j = size - 1; j >= 0; j-- )
        {
            if ( data[j] == e )
            {    return count;        }
            else {   count++;            }     }
        return -1;
    }
} String output = "";
      for (Node n=top;n!=null;n=n.next){
        output=output+n.val+" ";
      }
      return output;
    }