import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        int cir[] = {7,8,0,0,0,1,2,3,4,5,6};
        print(cir, 5, 8);
    }
    
    public static void print (int[] cir, int start, int size) {
        int lin[] = new int[size];
        for (int i = start, j = 0; j < size; i = (i+1)%cir.length, ++j) {
            lin[j] = cir[i];
        }
        for (int i = lin.length-1; i >= 0; --i) {
            if (lin[i] != 0 && lin[i] % 2 == 0) System.out.print(lin[i] + " ");
        }
        System.out.println();
    }
}