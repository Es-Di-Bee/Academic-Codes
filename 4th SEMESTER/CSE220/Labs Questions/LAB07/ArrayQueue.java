public class ArrayQueue implements Queue
{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue()
    {
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        boolean flag = false;
        if ( size == 0 )
        {
            flag = true;
        }
        return flag;
    }
    public void enqueue(Object o) throws QueueOverflowException
    {
        if ( size == data.length )
        {
            throw new QueueOverflowException();
        }
        if ( size == 0 )
        {
            front = 0;
            rear = 0;
            data[size] = o;
        }
        else
        {
            data[rear] = o;
        }
        size++;
        rear++;
    }
    public Object dequeue() throws QueueUnderflowException
    {
        if ( size == 0 )
        {
            throw new QueueUnderflowException();
        }
        Object temp = data[front];
        data[front] = null;
        front++;
        size--;
        return temp;
    }
    public Object peek() throws QueueUnderflowException
    {
        if ( isEmpty() == true )
        {
            throw new QueueUnderflowException();
        }
        return data[front];
    }
    public String toString()
    {
        String f = " ";
        if ( isEmpty() == true )
        {
            f = "Empty Queue";
        }
        else
        {
            int k = front;
            for ( int v = 0; v <= size - 1; v++ )
            {
                if ( k == front )
                {
                    f = "[ " + data[k] + " ";
                }
                else if ( k == ((front+size-1)%data.length) )
                {
                    f = f + data[k] + " ]" ;
                }
                else
                {
                    f = f + data[k] + " " ;
                }  
                k = ( k + 1 ) % data.length;
            }
        }
        return f;
    }
    public Object[] toArray()
    {
        int k = front;
        Object [] temp = new Object[size];
        for ( int v = 0; v <= size - 1; v++ )
        {
            temp[v] = data[k];
            k = ( k + 1 ) % data.length;
        }
        return temp;
    }
    public int search(Object o)
    {
        int k = front;
        int pos = 0;
        for ( int v = 0; v <= size - 1; v++ )
        {
            if ( data[k] == o )
            {
                return pos;
            }
            pos++;
            k = (k+1)%data.length;
        }
        return -1;
    }
}