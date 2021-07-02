import java.util.Arrays;

public class Task1 {
    private static int[] a = {3,1,2,5,6,4};

    public static void main(String[] args) {
        sort(0);
        System.err.println("Using SELECTION SORT algorithm:");
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int index) {
        if (index == a.length) return;
        swap(index);
        sort(++index);
    }

    public static void swap(int i) {
        for(int j = i+1; j < a.length; ++j) {
            if (a[i] > a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}


