/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararray;

/**
 *
 * @author 19101085
 */
public class TestCircularArray{
  
  String [] cir;
  int size;
  int start;
  
  public TestCircularArray(String[]lin, int st, int sz){
    cir = new String[lin.length];
    this.size = sz;
    this.start = st;
    for (int i = 0, j = st; i < lin.length; ++i) {
        cir[j] = lin[i];
        j =(j+1) % lin.length;
    }
    display();
    
  }
  
  public void sort(){
    // Sort the cir array using bubble/selection sort
    // Alert! The numbers in the array are in Strings
    // convert them to integer first
    // hint: Integet.parseInt()
    
    // TO DO
    int [] a = new int[size];
    for (int i = start, j = 0; j < size; ++j) { // making linear array
        a[j] = Integer.parseInt(cir[i]);
        i = (i+1) % cir.length;
    }
    for (int i = 0; i < size; ++i) { // sorting method
        for (int j = i+1; j < size; ++j) {
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    for (int i = start, j = 0; j < size; ++j) { // copying to circular array again
        cir[i] = Integer.toString(a[j]);
        i = (i+1)%cir.length;
    }
    display();
   }
  public int countOdd(){
    int count = 0; int st = start;
     for(int i =0;i<size;i++){
       String word = cir[st];
       int num = 0;
       for(int j=0;j<word.length();j++){
         num = num + (int)(word.charAt(j));
       }
       if (num%2!=0){
         count++;
       }
       st = (st+1)%cir.length;
     }
    return count;
  }
  
  public int countEven(){
    int count = 0; int st = start;
     for(int i =0;i<size;i++){
       String word = cir[st];
       int num = 0;
       for(int j=0;j<word.length();j++){
         num = num + (int)(word.charAt(j));
       }
       if (num%2==0){
         count++;
       }
       st = (st+1)%cir.length;
     }
    return count;
  }
  
  public void insert(String item,int offset) throws CircularArrayException{
    /* If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must createhe CircularArrayException object send the name of the particular exception as String in the constructor
     * one of them is done for you
     * 
     * If there is/are empty space(s), insert using LEFT shift.
     * Offset means how far from start. The index has been calculated for you.
     * Offset cannot be more than size
     * Note that the element pointed by start will also shift, hence change the start at the end
     * increment size
     */
    
    if (offset<0 || offset>size){
      throw new CircularArrayException("Invalid offset");
    }
    
    if (size==cir.length){
      throw new CircularArrayException("Array full");
    }
    
    int index = (start+offset)%cir.length;  
    
    int to = (start+cir.length-1)  % cir.length;
    int from = start;
    
    for (int i = 0 ; i < size; ++i) {
        cir[to] = cir[from];
        to = from;
        from = (from+1) % cir.length;
    }
    
    cir[index] = item;
    start = ( (start+cir.length-1) % cir.length);
    ++size;
    display();
  }
  
  public String delete (int offset)throws CircularArrayException{
    /* If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must send the name of the particular exception as String in the constructor
     * shown in insert()
     * 
     * Delete using right shift.
     * Note that the element pointed by start will also shift, hence change the start at the end
     * decrement size
     * return the delete element
     */
    int index = (start+offset)%cir.length;
    if (size == 0) {
        throw new CircularArrayException("Full array is empty");
    }
    int to = index;
    int from = (index-1) % cir.length;
    System.out.println(size-offset);
    for (int i = 1; i <= offset; ++i) {
        cir[to] = cir[from];
        cir[from] = null;
        to = from;
        from = (from-1) % cir.length;
    }
    --size;
    start = (start+1)%cir.length;
    display();
    return cir[index];
  }
  
  public void display(){
    int i = 0;
    int st = start;
    while(i<size){
      System.out.print(cir[st]+" ");
      i++;
      st = (st+1)%cir.length;
    }
    System.out.println();
  }
  
  
}
