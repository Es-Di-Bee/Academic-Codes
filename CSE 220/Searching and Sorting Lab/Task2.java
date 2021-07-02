import java.util.Arrays;

public class Task2 {
    private static int[] a = {3,1,2,5,6,4};

    public static void main(String[] args) {
        sort(1);
        System.err.println("Using INSERTION SORT algorithm");
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int index) {
        if (index == a.length) return;
        swap(index);
        sort(++index);
    }

    private static void swap(int index) {
        while (index != 0 && a[index] < a[index-1]) {
            int temp = a[index-1];
            a[index-1] = a[index];
            a[index] = temp;
            --index;
        }
    }
}


