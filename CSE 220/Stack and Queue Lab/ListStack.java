public class ListStack implements Stack{
    int size;
    Node top;


    public ListStack(){
        size = 0;
        top = null;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void push(Object e) throws StackOverflowException {
        if (isEmpty() == true) {
            top = new Node(e, null);
            ++size;
        } else {
            Node temp = new Node(e, top);
            top = temp;
            ++size;
        }
    }

    public Object pop() throws StackUnderflowException {
        if (size > 0) {
            Node temp = top;
            Object o = temp.val;
            top = top.next;
            --size;
            temp = null;
            return o;
        } else {
            StackUnderflowException exc = new StackUnderflowException();
            throw exc;
        }
    }

    public Object peek() throws StackUnderflowException {
        if (size > 0) return top.val;
        else {
            StackUnderflowException exc = new StackUnderflowException();
            throw exc;
        }
    }

    public String toString() {
        if (size == 0) return "Empty Stack";
        String str = "";
        for (Node n = top; n != null; n = n.next) str += " " + n.val;
        return str;
    }

    public Object[] toArray() {
        Object[] a = new Object[size];
        int i = 0;
        for (Node n = top; n != null; n = n.next) {
            a[i] = n.val;
            ++i;
        }
        return a;
    }

    public int search(Object e) {
        int count = 1;
        for (Node n = top; n != null; n = n.next, count++) {
            if(n.val == e) return size-count+1;
        }
        return -1;
    }
}