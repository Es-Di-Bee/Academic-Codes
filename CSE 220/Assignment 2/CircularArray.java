import java.util.Arrays;
public class CircularArray{
      
      private int start;
      private int size;
      private Object [] cir;
      
      /*
       * if Object [] lin = {10, 20, 30, 40, null}
       * then, CircularArray(lin, 2, 4) will generate
       * Object [] cir = {40, null, 10, 20, 30}
       */
      public CircularArray(Object [] lin, int st, int sz){
            this.cir = new Object[lin.length];
            this.start = st;
            this.size = sz;
            for (int i = start, j = 0; j < lin.length; ++j) {
                  cir[i] = lin[j];
                  i = (i+1) % lin.length;
            }
            //System.out.println(Arrays.toString(cir));
      }
      
      //Prints from index --> 0 to cir.length-1
      public void printFullLinear(){
            for (int i = 0 ; i < cir.length; ++i) {
                  System.out.print(cir[i] + " ");
            }
            System.out.println();
      }
      
      // Starts Printing from index start. Prints a total of size elements
      public void printForward(){
            for (int i = start, j = 1; j <= size; ++j) {
                  System.out.print(cir[i] + " ");
                  i = (i+1) % cir.length;
            }
            System.out.println();
      }
      
      
      public void printBackward(){
            for (int i = (start+cir.length-1)%cir.length, j = 0; j <= cir.length; ++j) {
                  if (cir[i] != null) {
                        System.out.print(cir[i] + " ");
                  }
                  i--;
                  if (i == -1) i = cir.length-1;
            }
            System.out.println();
      }
      
      // With no null cells
      public void linearize(){
            Object[] newArray = new Object[size];
            for (int i = start, j = 0; j <= cir.length; ++j) {
                  if (cir[i] != null) {
                        newArray[j] = cir[i];
                        i = (i+1) % cir.length;
                  }
            }
            cir = newArray;
      }
      
      // Do not change the Start index
      public void resizeStartUnchanged(int newcapacity){
            // System.out.println(start);
            Object[] a = new Object[newcapacity];
            for (int i = start, j = start; i < cir.length+start;) {
                  a[i] = cir[j];
                  i = (i+1) % newcapacity;
                  ++j;
                  if (j == cir.length) j = 0;
            }
            cir = a;
      }
      
      // Start index becomes zero
      public void resizeByLinearize(int newcapacity){
            Object[] a = new Object[newcapacity];
            for (int i = start, j = 0; j < cir.length; ++j) {
                  a[j] = cir[i];
                  i = (i+1)%cir.length;
            }
            cir = a;
      }
      
      /* pos --> position relative to start. Valid range of pos--> 0 to size.
       * Increase array length by 3 if size==cir.length
       * use resizeStartUnchanged() for resizing.
       */
      public void insertByRightShift(Object elem, int pos){
            if (size == cir.length) {
                  resizeStartUnchanged(size + 3);
            }
            int index = (start + pos) % cir.length;
            int from = (start+size-1) % cir.length;
            int to = (start+size) % cir.length;
            for (int i = 0; i < size-pos; ++i) {
                  cir[to] = cir[from];
                  to = from;
                  from--;
                  if (from == -1) {
                        from = cir.length-1;
                  }
            }
            cir[index] = elem;
            ++size;
      }
      
      public void insertByLeftShift(Object elem, int pos){
            if (size == cir.length) {
                  resizeStartUnchanged(size + 3);
            }
            int index = (start + pos) % cir.length;
            int to = (start+cir.length-1)  % cir.length;
            int from = start;
            for (int i = 0 ; i < size-pos; ++i) {
                  cir[to] = cir[from];
                  to = from;
                  from = (from+1) % cir.length;
            }
            cir[index] = elem;
            start = ( (start+cir.length-1) % cir.length);
            ++size;
      }
      
      /* parameter--> pos. pos --> position relative to start.
       * Valid range of pos--> 0 to size-1
       */
      public void removeByLeftShift(int pos){
            int index = (start+pos)  % cir.length;
            int to = index;
            int from = (index+1) % cir.length;
            for (int i = 1; i <= size-pos; ++i) {
                  cir[to] = cir[from];
                  cir[from] = null;
                  to = from;
                  from = (from+1) % cir.length;
            }
            --size;
      }
      
      /* parameter--> pos. pos --> position relative to start.
       * Valid range of pos--> 0 to size-1
       */
      public void removeByRightShift(int pos){
            int index = (start+pos)  % cir.length;
            int to = index;
            int from = (index-1) % cir.length;
            System.out.println(size-pos);
            for (int i = 1; i <= pos; ++i) {
                  cir[to] = cir[from];
                  cir[from] = null;
                  to = from;
                  from = (from-1) % cir.length;
            }
            --size;
            start = (start+1)%cir.length;
      }
      
      
      //This method will check whether the array is palindrome or not
      public void palindromeCheck(){
            boolean isPalindrome = true;
            for (int i = start, j = (start+size-1)%cir.length, c = 1; c <= size; ++c) {
                  if (cir[i] != cir[j]) {
                        isPalindrome = false;
                        break;
                  }
                  i = (i+1) % cir.length;
                  --j;
                  if (j == -1) j = cir.length-1;
            }
            if (isPalindrome == true) {
                  System.out.println("This array is a Palindrome");
            } else {
                  System.out.println("This array is NOT a Palindrome");
            }
      }
      
      
      //This method will sort the values by keeping the start unchanged
      public void sort(){
            Object[] a = new Object[size];
            for (int i = start, j = 0; j < size; ++j) {
                  a[j] = cir[i];
                  i = (i+1) % cir.length;
            }
            for (int i = 0; i < size; ++i) {
                  for (int j = i+1; j < size; ++j) {
                        if ((int)a[i] > (int)a[j]) {
                              Object temp = a[i];
                              a[i] = a[j];
                              a[j] = temp;
                        }
                  }
            }
            for (int i = start, j = 0; j < size; ++j) {
                  cir[i] = a[j];
                  i = (i+1) % cir.length;
            }
      }
      
      //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
      public boolean equivalent(CircularArray k){
            if (this.size != k.size) return false;
            for (int i = this.start, j = k.start, c = 1; c <= size; ++c) { 
                  if ((int)this.cir[i] != (int)k.cir[j]) return false;
                  i = (i+1) % this.cir.length;
                  j = (j+1) % k.cir.length;
            }
            return true;
      }
}