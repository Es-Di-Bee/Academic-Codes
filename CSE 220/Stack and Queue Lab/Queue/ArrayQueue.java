public class ArrayQueue implements Queue {
    int size;
    int front;
    int rear;
    Object [] data;

    public ArrayQueue(){
        size = 0;
        rear = -1;
        front = -1;
        data = new Object[5];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }

    public void enqueue(Object e) throws QueueOverflowException{
        if(size == data.length) throw new QueueOverflowException();
        else if (isEmpty()) {
            front = 0;
            rear = 0;
        }
        data[rear] = e;
        ++rear;
        ++size;
    }

    public Object dequeue() throws QueueUnderflowException{
        if(isEmpty()) throw new QueueUnderflowException();
        Object temp = data[front];
        data[front] = null;
        ++front;
        --size;
        return temp;
    }

    public Object peek() throws QueueUnderflowException{
        if(isEmpty()) throw new QueueUnderflowException();
        return data[front];
    }

    public String toString(){
        String str = "[ ";
        for (int i = 0; i < size; i++) {
            str += data[(i+front)%data.length] + " ";
        }
        return str + "]";
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = data[(i+front)%data.length];
        }
        return arr;
    }

    public int search(Object e){
        for (int i = 0; i < size; i++) {
            if(e == data[(i+front)%data.length]) return i;
        }
        return -1;
    }

}
