public class ArrayStack implements Stack{
    int size;
    Object [] data;

    public ArrayStack(){
        size = 0;
        data = new Object[5];
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
        if (size < data.length) {
            data[size] = e;
            ++size;
        } else {
            StackOverflowException exc = new StackOverflowException();
            throw exc;
        }
    }

    public Object pop() throws StackUnderflowException {
        if (size > 0) {
            Object temp = data[size-1];
            data[size-1] = null;
            --size;
            return temp;
        } else {
            StackUnderflowException exc = new StackUnderflowException();
            throw exc;
        }
    }

    public Object peek() throws StackUnderflowException {
        if (size > 0) {
            Object temp = data[size-1];
            return temp;
        } else {
            StackUnderflowException exc = new StackUnderflowException();
            throw exc;
        }
    }

    public String toString() {
        if (size == 0) return "Empty Stack";
        String str = "";
        for (int i = size-1; i >= 0; --i) {
            str += " " + data[i];
        }
        return str;
    }

    public Object[] toArray() {
        Object[] a = new Object[size];
        for (int i = size-1, j = 0; i >= 0; --i, ++j) {
            a[j] = data[i];
        }
        return a;
    }

    public int search(Object e) {
        int dis = -1;
        for (int i = 0; i < size; i++) {
            if (e == data[i]) {
                return size-i-1;
            }
        }
        return dis;
    }
}