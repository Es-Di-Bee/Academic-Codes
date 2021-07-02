public class ListQueue implements Queue {
    int size;
    Node front;
    Node rear;

    public ListQueue(){
        size = 0;
        front = null;
        rear =null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0) return  true;
        return false;
    }

    public void enqueue(Object e) throws QueueOverflowException{
        if (size == 0) {
            front = new Node(null, null);
            rear = front;
            rear.val = e;
        } else {
            rear.next = new Node(e, null);
            rear = rear.next;
        }
        ++size;
    }

    public Object dequeue() throws QueueUnderflowException{
        if(isEmpty()) throw new QueueUnderflowException();
        Node temp = front;
        front = front.next;
        --size;
        Object o = temp.val;
        temp = null;
        return o;
    }

    public Object peek() throws QueueUnderflowException{
        if(isEmpty()) throw new QueueUnderflowException();
        return front.val;
    }

    public String toString(){
        String str = "[ ";
        for (Node n = front; n != null; n = n.next) {
            str += n.val + " ";
        }
        return str + "]";
    }

    public Object[] toArray(){
        Object[] arr = new Object[size];
        int i = 0;
        for (Node n = front; n != null; n = n.next) {
            arr[i] = n.val;
            ++i;
        }
        return arr;
    }

    public int search(Object e){
        int i = 0;
        for (Node n = front; n != null; n = n.next) {
            if(e == n.val) return i;
            ++i;
        }
        return -1;
    }
}
